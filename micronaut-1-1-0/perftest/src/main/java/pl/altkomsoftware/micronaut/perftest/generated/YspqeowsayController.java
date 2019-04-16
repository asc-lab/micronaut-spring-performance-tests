package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yspqeowsay")
public class YspqeowsayController {

    private final YspqeowsayService yspqeowsayService;

    public YspqeowsayController(YspqeowsayService yspqeowsayService) {
        this.yspqeowsayService = yspqeowsayService;
    }

    @Get("/")
    public String index() {
        return yspqeowsayService.getGreeting();
    }
}
