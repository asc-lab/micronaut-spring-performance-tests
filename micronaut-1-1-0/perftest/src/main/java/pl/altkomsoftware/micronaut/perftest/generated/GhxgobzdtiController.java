package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ghxgobzdti")
public class GhxgobzdtiController {

    private final GhxgobzdtiService ghxgobzdtiService;

    public GhxgobzdtiController(GhxgobzdtiService ghxgobzdtiService) {
        this.ghxgobzdtiService = ghxgobzdtiService;
    }

    @Get("/")
    public String index() {
        return ghxgobzdtiService.getGreeting();
    }
}
