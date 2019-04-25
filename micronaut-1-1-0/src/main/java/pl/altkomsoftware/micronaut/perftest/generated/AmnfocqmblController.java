package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/amnfocqmbl")
public class AmnfocqmblController {

    private final AmnfocqmblService amnfocqmblService;

    public AmnfocqmblController(AmnfocqmblService amnfocqmblService) {
        this.amnfocqmblService = amnfocqmblService;
    }

    @Get("/")
    public String index() {
        return amnfocqmblService.getGreeting();
    }
}
