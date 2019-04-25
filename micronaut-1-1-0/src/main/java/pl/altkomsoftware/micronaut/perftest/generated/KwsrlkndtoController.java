package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kwsrlkndto")
public class KwsrlkndtoController {

    private final KwsrlkndtoService kwsrlkndtoService;

    public KwsrlkndtoController(KwsrlkndtoService kwsrlkndtoService) {
        this.kwsrlkndtoService = kwsrlkndtoService;
    }

    @Get("/")
    public String index() {
        return kwsrlkndtoService.getGreeting();
    }
}
