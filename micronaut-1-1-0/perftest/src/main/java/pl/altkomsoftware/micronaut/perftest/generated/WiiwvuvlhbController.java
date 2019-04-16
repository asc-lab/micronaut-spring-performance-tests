package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wiiwvuvlhb")
public class WiiwvuvlhbController {

    private final WiiwvuvlhbService wiiwvuvlhbService;

    public WiiwvuvlhbController(WiiwvuvlhbService wiiwvuvlhbService) {
        this.wiiwvuvlhbService = wiiwvuvlhbService;
    }

    @Get("/")
    public String index() {
        return wiiwvuvlhbService.getGreeting();
    }
}
