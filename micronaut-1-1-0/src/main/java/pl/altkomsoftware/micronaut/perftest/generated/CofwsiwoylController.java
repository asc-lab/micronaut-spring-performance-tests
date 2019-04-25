package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cofwsiwoyl")
public class CofwsiwoylController {

    private final CofwsiwoylService cofwsiwoylService;

    public CofwsiwoylController(CofwsiwoylService cofwsiwoylService) {
        this.cofwsiwoylService = cofwsiwoylService;
    }

    @Get("/")
    public String index() {
        return cofwsiwoylService.getGreeting();
    }
}
