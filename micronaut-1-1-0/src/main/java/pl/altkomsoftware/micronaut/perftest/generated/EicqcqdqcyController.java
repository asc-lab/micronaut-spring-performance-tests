package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eicqcqdqcy")
public class EicqcqdqcyController {

    private final EicqcqdqcyService eicqcqdqcyService;

    public EicqcqdqcyController(EicqcqdqcyService eicqcqdqcyService) {
        this.eicqcqdqcyService = eicqcqdqcyService;
    }

    @Get("/")
    public String index() {
        return eicqcqdqcyService.getGreeting();
    }
}
