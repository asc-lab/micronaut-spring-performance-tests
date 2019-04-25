package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wnangzuscy")
public class WnangzuscyController {

    private final WnangzuscyService wnangzuscyService;

    public WnangzuscyController(WnangzuscyService wnangzuscyService) {
        this.wnangzuscyService = wnangzuscyService;
    }

    @Get("/")
    public String index() {
        return wnangzuscyService.getGreeting();
    }
}
