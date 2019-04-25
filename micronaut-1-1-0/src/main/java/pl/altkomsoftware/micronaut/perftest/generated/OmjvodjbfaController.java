package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/omjvodjbfa")
public class OmjvodjbfaController {

    private final OmjvodjbfaService omjvodjbfaService;

    public OmjvodjbfaController(OmjvodjbfaService omjvodjbfaService) {
        this.omjvodjbfaService = omjvodjbfaService;
    }

    @Get("/")
    public String index() {
        return omjvodjbfaService.getGreeting();
    }
}
