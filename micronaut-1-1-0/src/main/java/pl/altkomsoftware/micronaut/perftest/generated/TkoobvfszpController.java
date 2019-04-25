package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tkoobvfszp")
public class TkoobvfszpController {

    private final TkoobvfszpService tkoobvfszpService;

    public TkoobvfszpController(TkoobvfszpService tkoobvfszpService) {
        this.tkoobvfszpService = tkoobvfszpService;
    }

    @Get("/")
    public String index() {
        return tkoobvfszpService.getGreeting();
    }
}
