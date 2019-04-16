package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/otwuclvydj")
public class OtwuclvydjController {

    private final OtwuclvydjService otwuclvydjService;

    public OtwuclvydjController(OtwuclvydjService otwuclvydjService) {
        this.otwuclvydjService = otwuclvydjService;
    }

    @Get("/")
    public String index() {
        return otwuclvydjService.getGreeting();
    }
}
