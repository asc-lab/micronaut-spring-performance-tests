package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bqbeftswld")
public class BqbeftswldController {

    private final BqbeftswldService bqbeftswldService;

    public BqbeftswldController(BqbeftswldService bqbeftswldService) {
        this.bqbeftswldService = bqbeftswldService;
    }

    @Get("/")
    public String index() {
        return bqbeftswldService.getGreeting();
    }
}
