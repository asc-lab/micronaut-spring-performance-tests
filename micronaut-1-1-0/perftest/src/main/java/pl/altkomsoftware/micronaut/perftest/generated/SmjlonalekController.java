package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/smjlonalek")
public class SmjlonalekController {

    private final SmjlonalekService smjlonalekService;

    public SmjlonalekController(SmjlonalekService smjlonalekService) {
        this.smjlonalekService = smjlonalekService;
    }

    @Get("/")
    public String index() {
        return smjlonalekService.getGreeting();
    }
}
