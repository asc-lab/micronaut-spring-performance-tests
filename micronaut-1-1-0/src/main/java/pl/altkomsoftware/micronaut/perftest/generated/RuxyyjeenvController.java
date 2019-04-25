package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ruxyyjeenv")
public class RuxyyjeenvController {

    private final RuxyyjeenvService ruxyyjeenvService;

    public RuxyyjeenvController(RuxyyjeenvService ruxyyjeenvService) {
        this.ruxyyjeenvService = ruxyyjeenvService;
    }

    @Get("/")
    public String index() {
        return ruxyyjeenvService.getGreeting();
    }
}
