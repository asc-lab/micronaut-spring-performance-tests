package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sfawuvmher")
public class SfawuvmherController {

    private final SfawuvmherService sfawuvmherService;

    public SfawuvmherController(SfawuvmherService sfawuvmherService) {
        this.sfawuvmherService = sfawuvmherService;
    }

    @Get("/")
    public String index() {
        return sfawuvmherService.getGreeting();
    }
}
