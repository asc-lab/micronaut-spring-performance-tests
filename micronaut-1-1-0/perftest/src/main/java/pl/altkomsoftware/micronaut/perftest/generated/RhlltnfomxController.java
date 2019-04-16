package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rhlltnfomx")
public class RhlltnfomxController {

    private final RhlltnfomxService rhlltnfomxService;

    public RhlltnfomxController(RhlltnfomxService rhlltnfomxService) {
        this.rhlltnfomxService = rhlltnfomxService;
    }

    @Get("/")
    public String index() {
        return rhlltnfomxService.getGreeting();
    }
}
