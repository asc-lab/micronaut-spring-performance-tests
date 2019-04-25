package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hkluyhlqbm")
public class HkluyhlqbmController {

    private final HkluyhlqbmService hkluyhlqbmService;

    public HkluyhlqbmController(HkluyhlqbmService hkluyhlqbmService) {
        this.hkluyhlqbmService = hkluyhlqbmService;
    }

    @Get("/")
    public String index() {
        return hkluyhlqbmService.getGreeting();
    }
}
