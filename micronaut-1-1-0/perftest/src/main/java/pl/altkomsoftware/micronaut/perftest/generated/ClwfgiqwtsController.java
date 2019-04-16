package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/clwfgiqwts")
public class ClwfgiqwtsController {

    private final ClwfgiqwtsService clwfgiqwtsService;

    public ClwfgiqwtsController(ClwfgiqwtsService clwfgiqwtsService) {
        this.clwfgiqwtsService = clwfgiqwtsService;
    }

    @Get("/")
    public String index() {
        return clwfgiqwtsService.getGreeting();
    }
}
