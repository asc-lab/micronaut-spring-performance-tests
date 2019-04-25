package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/htzuyxsidy")
public class HtzuyxsidyController {

    private final HtzuyxsidyService htzuyxsidyService;

    public HtzuyxsidyController(HtzuyxsidyService htzuyxsidyService) {
        this.htzuyxsidyService = htzuyxsidyService;
    }

    @Get("/")
    public String index() {
        return htzuyxsidyService.getGreeting();
    }
}
