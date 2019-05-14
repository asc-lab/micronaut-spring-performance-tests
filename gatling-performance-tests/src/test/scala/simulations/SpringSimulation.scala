package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SpringSimulation extends Simulation {

  val config = http
    .baseUrl("http://localhost:9998") // Here is the root for all relative URLs
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  object randomStringGenerator {
    def randomString(length: Int) = scala.util.Random.alphanumeric.filter(_.isLetter).take(length).mkString
  }

  var catReq = "{\"code\": \"TestCode-0000000000\",\"name\":\"TestName\"}"
  var randomSession = Iterator.continually(Map("randcode" -> catReq.replace("0000000000", randomStringGenerator.randomString(10))))

  val scn = scenario("AddCustomer")
    .exec(http("Customer-POST")
      .post("/api/customer")
      .header("Content-Type", "application/json")
      .body(StringBody("""{"name":"Test","country":"Poland","zipCode":"00-001","city":"Warsaw","street":"Chlodna"}"""))
      .check(status.is(200)))
    .pause(1)
    .feed(randomSession)
    .exec(http("Category-POST")
      .post("/api/category")
      .header("Content-Type", "application/json")
      .body(StringBody("""${randcode}"""))
      .check(status.is(200))
    )
    .pause(1)
    .exec(http("Categories-GET")
      .get("/api/category/all")
      .check(status.is(200))
    )

  setUp(scn.inject(atOnceUsers(1000)).protocols(config))
}
