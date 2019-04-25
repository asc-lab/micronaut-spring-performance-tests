package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iimduttofr")
public class IimduttofrController {

    private final IimduttofrService iimduttofrService;

    public IimduttofrController(IimduttofrService iimduttofrService) {
        this.iimduttofrService = iimduttofrService;
    }

    @Get("/")
    public String index() {
        return iimduttofrService.getGreeting();
    }
}
