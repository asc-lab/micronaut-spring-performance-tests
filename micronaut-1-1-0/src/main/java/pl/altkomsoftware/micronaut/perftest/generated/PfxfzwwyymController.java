package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pfxfzwwyym")
public class PfxfzwwyymController {

    private final PfxfzwwyymService pfxfzwwyymService;

    public PfxfzwwyymController(PfxfzwwyymService pfxfzwwyymService) {
        this.pfxfzwwyymService = pfxfzwwyymService;
    }

    @Get("/")
    public String index() {
        return pfxfzwwyymService.getGreeting();
    }
}
