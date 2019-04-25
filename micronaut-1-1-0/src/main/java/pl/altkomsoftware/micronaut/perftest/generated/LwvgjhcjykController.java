package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lwvgjhcjyk")
public class LwvgjhcjykController {

    private final LwvgjhcjykService lwvgjhcjykService;

    public LwvgjhcjykController(LwvgjhcjykService lwvgjhcjykService) {
        this.lwvgjhcjykService = lwvgjhcjykService;
    }

    @Get("/")
    public String index() {
        return lwvgjhcjykService.getGreeting();
    }
}
