package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kxlizjwxso")
public class KxlizjwxsoController {

    private final KxlizjwxsoService kxlizjwxsoService;

    public KxlizjwxsoController(KxlizjwxsoService kxlizjwxsoService) {
        this.kxlizjwxsoService = kxlizjwxsoService;
    }

    @Get("/")
    public String index() {
        return kxlizjwxsoService.getGreeting();
    }
}
