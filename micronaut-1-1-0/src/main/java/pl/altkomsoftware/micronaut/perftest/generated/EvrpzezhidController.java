package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/evrpzezhid")
public class EvrpzezhidController {

    private final EvrpzezhidService evrpzezhidService;

    public EvrpzezhidController(EvrpzezhidService evrpzezhidService) {
        this.evrpzezhidService = evrpzezhidService;
    }

    @Get("/")
    public String index() {
        return evrpzezhidService.getGreeting();
    }
}
