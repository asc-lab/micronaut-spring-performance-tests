package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kxtyfddylq")
public class KxtyfddylqController {

    private final KxtyfddylqService kxtyfddylqService;

    public KxtyfddylqController(KxtyfddylqService kxtyfddylqService) {
        this.kxtyfddylqService = kxtyfddylqService;
    }

    @Get("/")
    public String index() {
        return kxtyfddylqService.getGreeting();
    }
}
