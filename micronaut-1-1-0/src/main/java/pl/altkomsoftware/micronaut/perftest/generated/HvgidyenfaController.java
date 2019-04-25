package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hvgidyenfa")
public class HvgidyenfaController {

    private final HvgidyenfaService hvgidyenfaService;

    public HvgidyenfaController(HvgidyenfaService hvgidyenfaService) {
        this.hvgidyenfaService = hvgidyenfaService;
    }

    @Get("/")
    public String index() {
        return hvgidyenfaService.getGreeting();
    }
}
