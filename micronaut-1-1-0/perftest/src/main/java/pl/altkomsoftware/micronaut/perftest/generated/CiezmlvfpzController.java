package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ciezmlvfpz")
public class CiezmlvfpzController {

    private final CiezmlvfpzService ciezmlvfpzService;

    public CiezmlvfpzController(CiezmlvfpzService ciezmlvfpzService) {
        this.ciezmlvfpzService = ciezmlvfpzService;
    }

    @Get("/")
    public String index() {
        return ciezmlvfpzService.getGreeting();
    }
}
