package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/srnqiehopr")
public class SrnqiehoprController {

    private final SrnqiehoprService srnqiehoprService;

    public SrnqiehoprController(SrnqiehoprService srnqiehoprService) {
        this.srnqiehoprService = srnqiehoprService;
    }

    @Get("/")
    public String index() {
        return srnqiehoprService.getGreeting();
    }
}
