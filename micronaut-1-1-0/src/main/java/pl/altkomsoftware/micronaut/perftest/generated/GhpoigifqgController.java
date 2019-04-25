package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ghpoigifqg")
public class GhpoigifqgController {

    private final GhpoigifqgService ghpoigifqgService;

    public GhpoigifqgController(GhpoigifqgService ghpoigifqgService) {
        this.ghpoigifqgService = ghpoigifqgService;
    }

    @Get("/")
    public String index() {
        return ghpoigifqgService.getGreeting();
    }
}
