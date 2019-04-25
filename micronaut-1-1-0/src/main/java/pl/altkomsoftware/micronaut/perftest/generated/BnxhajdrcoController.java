package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bnxhajdrco")
public class BnxhajdrcoController {

    private final BnxhajdrcoService bnxhajdrcoService;

    public BnxhajdrcoController(BnxhajdrcoService bnxhajdrcoService) {
        this.bnxhajdrcoService = bnxhajdrcoService;
    }

    @Get("/")
    public String index() {
        return bnxhajdrcoService.getGreeting();
    }
}
