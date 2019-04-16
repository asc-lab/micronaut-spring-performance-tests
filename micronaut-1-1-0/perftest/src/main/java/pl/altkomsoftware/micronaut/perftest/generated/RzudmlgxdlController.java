package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rzudmlgxdl")
public class RzudmlgxdlController {

    private final RzudmlgxdlService rzudmlgxdlService;

    public RzudmlgxdlController(RzudmlgxdlService rzudmlgxdlService) {
        this.rzudmlgxdlService = rzudmlgxdlService;
    }

    @Get("/")
    public String index() {
        return rzudmlgxdlService.getGreeting();
    }
}
