package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dkuzpenedj")
public class DkuzpenedjController {

    private final DkuzpenedjService dkuzpenedjService;

    public DkuzpenedjController(DkuzpenedjService dkuzpenedjService) {
        this.dkuzpenedjService = dkuzpenedjService;
    }

    @Get("/")
    public String index() {
        return dkuzpenedjService.getGreeting();
    }
}
