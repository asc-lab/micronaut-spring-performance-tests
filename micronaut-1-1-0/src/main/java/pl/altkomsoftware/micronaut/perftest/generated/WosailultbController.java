package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wosailultb")
public class WosailultbController {

    private final WosailultbService wosailultbService;

    public WosailultbController(WosailultbService wosailultbService) {
        this.wosailultbService = wosailultbService;
    }

    @Get("/")
    public String index() {
        return wosailultbService.getGreeting();
    }
}
