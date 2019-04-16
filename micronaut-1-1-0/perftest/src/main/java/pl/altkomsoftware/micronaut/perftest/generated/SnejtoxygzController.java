package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/snejtoxygz")
public class SnejtoxygzController {

    private final SnejtoxygzService snejtoxygzService;

    public SnejtoxygzController(SnejtoxygzService snejtoxygzService) {
        this.snejtoxygzService = snejtoxygzService;
    }

    @Get("/")
    public String index() {
        return snejtoxygzService.getGreeting();
    }
}
