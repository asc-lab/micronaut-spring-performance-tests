package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tqbuvvrnnm")
public class TqbuvvrnnmController {

    private final TqbuvvrnnmService tqbuvvrnnmService;

    public TqbuvvrnnmController(TqbuvvrnnmService tqbuvvrnnmService) {
        this.tqbuvvrnnmService = tqbuvvrnnmService;
    }

    @Get("/")
    public String index() {
        return tqbuvvrnnmService.getGreeting();
    }
}
