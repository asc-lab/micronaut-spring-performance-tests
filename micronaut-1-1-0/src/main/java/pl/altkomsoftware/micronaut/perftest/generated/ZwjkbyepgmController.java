package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zwjkbyepgm")
public class ZwjkbyepgmController {

    private final ZwjkbyepgmService zwjkbyepgmService;

    public ZwjkbyepgmController(ZwjkbyepgmService zwjkbyepgmService) {
        this.zwjkbyepgmService = zwjkbyepgmService;
    }

    @Get("/")
    public String index() {
        return zwjkbyepgmService.getGreeting();
    }
}
