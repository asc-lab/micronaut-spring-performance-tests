package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/octrobbwim")
public class OctrobbwimController {

    private final OctrobbwimService octrobbwimService;

    public OctrobbwimController(OctrobbwimService octrobbwimService) {
        this.octrobbwimService = octrobbwimService;
    }

    @Get("/")
    public String index() {
        return octrobbwimService.getGreeting();
    }
}
