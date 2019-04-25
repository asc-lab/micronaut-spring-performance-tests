package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eoxlqjhooy")
public class EoxlqjhooyController {

    private final EoxlqjhooyService eoxlqjhooyService;

    public EoxlqjhooyController(EoxlqjhooyService eoxlqjhooyService) {
        this.eoxlqjhooyService = eoxlqjhooyService;
    }

    @Get("/")
    public String index() {
        return eoxlqjhooyService.getGreeting();
    }
}
