package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xicumqhjdn")
public class XicumqhjdnController {

    private final XicumqhjdnService xicumqhjdnService;

    public XicumqhjdnController(XicumqhjdnService xicumqhjdnService) {
        this.xicumqhjdnService = xicumqhjdnService;
    }

    @Get("/")
    public String index() {
        return xicumqhjdnService.getGreeting();
    }
}
