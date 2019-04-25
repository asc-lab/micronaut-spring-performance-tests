package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ouchdfswpk")
public class OuchdfswpkController {

    private final OuchdfswpkService ouchdfswpkService;

    public OuchdfswpkController(OuchdfswpkService ouchdfswpkService) {
        this.ouchdfswpkService = ouchdfswpkService;
    }

    @Get("/")
    public String index() {
        return ouchdfswpkService.getGreeting();
    }
}
