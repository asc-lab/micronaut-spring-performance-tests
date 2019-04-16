package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lwuxubtpml")
public class LwuxubtpmlController {

    private final LwuxubtpmlService lwuxubtpmlService;

    public LwuxubtpmlController(LwuxubtpmlService lwuxubtpmlService) {
        this.lwuxubtpmlService = lwuxubtpmlService;
    }

    @Get("/")
    public String index() {
        return lwuxubtpmlService.getGreeting();
    }
}
