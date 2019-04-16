package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/brfftdyhgw")
public class BrfftdyhgwController {

    private final BrfftdyhgwService brfftdyhgwService;

    public BrfftdyhgwController(BrfftdyhgwService brfftdyhgwService) {
        this.brfftdyhgwService = brfftdyhgwService;
    }

    @Get("/")
    public String index() {
        return brfftdyhgwService.getGreeting();
    }
}
