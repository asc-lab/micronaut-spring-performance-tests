package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zoxmylalof")
public class ZoxmylalofController {

    private final ZoxmylalofService zoxmylalofService;

    public ZoxmylalofController(ZoxmylalofService zoxmylalofService) {
        this.zoxmylalofService = zoxmylalofService;
    }

    @Get("/")
    public String index() {
        return zoxmylalofService.getGreeting();
    }
}
