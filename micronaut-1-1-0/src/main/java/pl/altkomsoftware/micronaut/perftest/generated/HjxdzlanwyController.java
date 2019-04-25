package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hjxdzlanwy")
public class HjxdzlanwyController {

    private final HjxdzlanwyService hjxdzlanwyService;

    public HjxdzlanwyController(HjxdzlanwyService hjxdzlanwyService) {
        this.hjxdzlanwyService = hjxdzlanwyService;
    }

    @Get("/")
    public String index() {
        return hjxdzlanwyService.getGreeting();
    }
}
