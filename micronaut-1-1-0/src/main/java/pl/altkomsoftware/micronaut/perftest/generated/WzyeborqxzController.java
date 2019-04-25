package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wzyeborqxz")
public class WzyeborqxzController {

    private final WzyeborqxzService wzyeborqxzService;

    public WzyeborqxzController(WzyeborqxzService wzyeborqxzService) {
        this.wzyeborqxzService = wzyeborqxzService;
    }

    @Get("/")
    public String index() {
        return wzyeborqxzService.getGreeting();
    }
}
