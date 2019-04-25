package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tzecsgzzur")
public class TzecsgzzurController {

    private final TzecsgzzurService tzecsgzzurService;

    public TzecsgzzurController(TzecsgzzurService tzecsgzzurService) {
        this.tzecsgzzurService = tzecsgzzurService;
    }

    @Get("/")
    public String index() {
        return tzecsgzzurService.getGreeting();
    }
}
