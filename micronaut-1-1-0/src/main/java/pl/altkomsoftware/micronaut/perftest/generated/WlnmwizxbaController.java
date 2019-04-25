package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wlnmwizxba")
public class WlnmwizxbaController {

    private final WlnmwizxbaService wlnmwizxbaService;

    public WlnmwizxbaController(WlnmwizxbaService wlnmwizxbaService) {
        this.wlnmwizxbaService = wlnmwizxbaService;
    }

    @Get("/")
    public String index() {
        return wlnmwizxbaService.getGreeting();
    }
}
