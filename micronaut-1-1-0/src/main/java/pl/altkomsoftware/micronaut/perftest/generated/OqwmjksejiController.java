package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oqwmjkseji")
public class OqwmjksejiController {

    private final OqwmjksejiService oqwmjksejiService;

    public OqwmjksejiController(OqwmjksejiService oqwmjksejiService) {
        this.oqwmjksejiService = oqwmjksejiService;
    }

    @Get("/")
    public String index() {
        return oqwmjksejiService.getGreeting();
    }
}
