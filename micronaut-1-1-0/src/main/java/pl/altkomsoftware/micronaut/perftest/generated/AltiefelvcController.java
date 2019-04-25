package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/altiefelvc")
public class AltiefelvcController {

    private final AltiefelvcService altiefelvcService;

    public AltiefelvcController(AltiefelvcService altiefelvcService) {
        this.altiefelvcService = altiefelvcService;
    }

    @Get("/")
    public String index() {
        return altiefelvcService.getGreeting();
    }
}
