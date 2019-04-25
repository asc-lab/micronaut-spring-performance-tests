package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ljftkalxxr")
public class LjftkalxxrController {

    private final LjftkalxxrService ljftkalxxrService;

    public LjftkalxxrController(LjftkalxxrService ljftkalxxrService) {
        this.ljftkalxxrService = ljftkalxxrService;
    }

    @Get("/")
    public String index() {
        return ljftkalxxrService.getGreeting();
    }
}
