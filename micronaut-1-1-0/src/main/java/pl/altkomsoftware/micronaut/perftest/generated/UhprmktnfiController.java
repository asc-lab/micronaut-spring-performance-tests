package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uhprmktnfi")
public class UhprmktnfiController {

    private final UhprmktnfiService uhprmktnfiService;

    public UhprmktnfiController(UhprmktnfiService uhprmktnfiService) {
        this.uhprmktnfiService = uhprmktnfiService;
    }

    @Get("/")
    public String index() {
        return uhprmktnfiService.getGreeting();
    }
}
