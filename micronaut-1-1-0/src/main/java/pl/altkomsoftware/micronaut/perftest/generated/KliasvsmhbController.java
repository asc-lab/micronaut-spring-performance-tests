package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kliasvsmhb")
public class KliasvsmhbController {

    private final KliasvsmhbService kliasvsmhbService;

    public KliasvsmhbController(KliasvsmhbService kliasvsmhbService) {
        this.kliasvsmhbService = kliasvsmhbService;
    }

    @Get("/")
    public String index() {
        return kliasvsmhbService.getGreeting();
    }
}
