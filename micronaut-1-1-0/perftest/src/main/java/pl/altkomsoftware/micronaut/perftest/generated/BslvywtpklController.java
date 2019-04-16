package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bslvywtpkl")
public class BslvywtpklController {

    private final BslvywtpklService bslvywtpklService;

    public BslvywtpklController(BslvywtpklService bslvywtpklService) {
        this.bslvywtpklService = bslvywtpklService;
    }

    @Get("/")
    public String index() {
        return bslvywtpklService.getGreeting();
    }
}
