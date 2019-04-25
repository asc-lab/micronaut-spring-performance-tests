package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vjzwtqbpcb")
public class VjzwtqbpcbController {

    private final VjzwtqbpcbService vjzwtqbpcbService;

    public VjzwtqbpcbController(VjzwtqbpcbService vjzwtqbpcbService) {
        this.vjzwtqbpcbService = vjzwtqbpcbService;
    }

    @Get("/")
    public String index() {
        return vjzwtqbpcbService.getGreeting();
    }
}
