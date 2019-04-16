package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fxprtiohpi")
public class FxprtiohpiController {

    private final FxprtiohpiService fxprtiohpiService;

    public FxprtiohpiController(FxprtiohpiService fxprtiohpiService) {
        this.fxprtiohpiService = fxprtiohpiService;
    }

    @Get("/")
    public String index() {
        return fxprtiohpiService.getGreeting();
    }
}
