package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/epjwohtcaq")
public class EpjwohtcaqController {

    private final EpjwohtcaqService epjwohtcaqService;

    public EpjwohtcaqController(EpjwohtcaqService epjwohtcaqService) {
        this.epjwohtcaqService = epjwohtcaqService;
    }

    @Get("/")
    public String index() {
        return epjwohtcaqService.getGreeting();
    }
}
