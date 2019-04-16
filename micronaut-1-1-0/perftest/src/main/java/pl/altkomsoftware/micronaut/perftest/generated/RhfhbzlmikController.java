package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rhfhbzlmik")
public class RhfhbzlmikController {

    private final RhfhbzlmikService rhfhbzlmikService;

    public RhfhbzlmikController(RhfhbzlmikService rhfhbzlmikService) {
        this.rhfhbzlmikService = rhfhbzlmikService;
    }

    @Get("/")
    public String index() {
        return rhfhbzlmikService.getGreeting();
    }
}
