package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ctcrupkfiw")
public class CtcrupkfiwController {

    private final CtcrupkfiwService ctcrupkfiwService;

    public CtcrupkfiwController(CtcrupkfiwService ctcrupkfiwService) {
        this.ctcrupkfiwService = ctcrupkfiwService;
    }

    @Get("/")
    public String index() {
        return ctcrupkfiwService.getGreeting();
    }
}
