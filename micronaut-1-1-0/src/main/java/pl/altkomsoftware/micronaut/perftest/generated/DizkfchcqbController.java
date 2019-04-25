package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dizkfchcqb")
public class DizkfchcqbController {

    private final DizkfchcqbService dizkfchcqbService;

    public DizkfchcqbController(DizkfchcqbService dizkfchcqbService) {
        this.dizkfchcqbService = dizkfchcqbService;
    }

    @Get("/")
    public String index() {
        return dizkfchcqbService.getGreeting();
    }
}
