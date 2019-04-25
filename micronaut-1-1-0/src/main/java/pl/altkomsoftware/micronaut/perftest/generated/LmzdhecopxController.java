package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lmzdhecopx")
public class LmzdhecopxController {

    private final LmzdhecopxService lmzdhecopxService;

    public LmzdhecopxController(LmzdhecopxService lmzdhecopxService) {
        this.lmzdhecopxService = lmzdhecopxService;
    }

    @Get("/")
    public String index() {
        return lmzdhecopxService.getGreeting();
    }
}
