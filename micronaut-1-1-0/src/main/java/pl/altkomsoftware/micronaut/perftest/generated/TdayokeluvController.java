package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tdayokeluv")
public class TdayokeluvController {

    private final TdayokeluvService tdayokeluvService;

    public TdayokeluvController(TdayokeluvService tdayokeluvService) {
        this.tdayokeluvService = tdayokeluvService;
    }

    @Get("/")
    public String index() {
        return tdayokeluvService.getGreeting();
    }
}
