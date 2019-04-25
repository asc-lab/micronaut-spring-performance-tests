package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eqppkauhtx")
public class EqppkauhtxController {

    private final EqppkauhtxService eqppkauhtxService;

    public EqppkauhtxController(EqppkauhtxService eqppkauhtxService) {
        this.eqppkauhtxService = eqppkauhtxService;
    }

    @Get("/")
    public String index() {
        return eqppkauhtxService.getGreeting();
    }
}
