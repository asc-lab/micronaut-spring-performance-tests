package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kwjomxutsl")
public class KwjomxutslController {

    private final KwjomxutslService kwjomxutslService;

    public KwjomxutslController(KwjomxutslService kwjomxutslService) {
        this.kwjomxutslService = kwjomxutslService;
    }

    @Get("/")
    public String index() {
        return kwjomxutslService.getGreeting();
    }
}
