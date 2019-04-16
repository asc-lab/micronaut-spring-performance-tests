package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/adyvikszyf")
public class AdyvikszyfController {

    private final AdyvikszyfService adyvikszyfService;

    public AdyvikszyfController(AdyvikszyfService adyvikszyfService) {
        this.adyvikszyfService = adyvikszyfService;
    }

    @Get("/")
    public String index() {
        return adyvikszyfService.getGreeting();
    }
}
