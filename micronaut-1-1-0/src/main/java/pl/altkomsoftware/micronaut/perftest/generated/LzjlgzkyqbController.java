package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lzjlgzkyqb")
public class LzjlgzkyqbController {

    private final LzjlgzkyqbService lzjlgzkyqbService;

    public LzjlgzkyqbController(LzjlgzkyqbService lzjlgzkyqbService) {
        this.lzjlgzkyqbService = lzjlgzkyqbService;
    }

    @Get("/")
    public String index() {
        return lzjlgzkyqbService.getGreeting();
    }
}
