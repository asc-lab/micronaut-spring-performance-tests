package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/reldaqvqph")
public class ReldaqvqphController {

    private final ReldaqvqphService reldaqvqphService;

    public ReldaqvqphController(ReldaqvqphService reldaqvqphService) {
        this.reldaqvqphService = reldaqvqphService;
    }

    @Get("/")
    public String index() {
        return reldaqvqphService.getGreeting();
    }
}
