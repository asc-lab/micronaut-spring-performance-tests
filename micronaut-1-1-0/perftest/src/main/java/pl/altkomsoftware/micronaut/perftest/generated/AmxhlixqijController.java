package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/amxhlixqij")
public class AmxhlixqijController {

    private final AmxhlixqijService amxhlixqijService;

    public AmxhlixqijController(AmxhlixqijService amxhlixqijService) {
        this.amxhlixqijService = amxhlixqijService;
    }

    @Get("/")
    public String index() {
        return amxhlixqijService.getGreeting();
    }
}
