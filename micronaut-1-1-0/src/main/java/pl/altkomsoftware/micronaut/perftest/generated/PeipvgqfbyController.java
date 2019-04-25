package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/peipvgqfby")
public class PeipvgqfbyController {

    private final PeipvgqfbyService peipvgqfbyService;

    public PeipvgqfbyController(PeipvgqfbyService peipvgqfbyService) {
        this.peipvgqfbyService = peipvgqfbyService;
    }

    @Get("/")
    public String index() {
        return peipvgqfbyService.getGreeting();
    }
}
