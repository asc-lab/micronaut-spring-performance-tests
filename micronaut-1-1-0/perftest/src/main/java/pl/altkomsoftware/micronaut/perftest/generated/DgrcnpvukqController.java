package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dgrcnpvukq")
public class DgrcnpvukqController {

    private final DgrcnpvukqService dgrcnpvukqService;

    public DgrcnpvukqController(DgrcnpvukqService dgrcnpvukqService) {
        this.dgrcnpvukqService = dgrcnpvukqService;
    }

    @Get("/")
    public String index() {
        return dgrcnpvukqService.getGreeting();
    }
}
