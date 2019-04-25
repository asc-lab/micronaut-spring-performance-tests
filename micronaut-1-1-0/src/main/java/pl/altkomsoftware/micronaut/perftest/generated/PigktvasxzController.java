package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pigktvasxz")
public class PigktvasxzController {

    private final PigktvasxzService pigktvasxzService;

    public PigktvasxzController(PigktvasxzService pigktvasxzService) {
        this.pigktvasxzService = pigktvasxzService;
    }

    @Get("/")
    public String index() {
        return pigktvasxzService.getGreeting();
    }
}
