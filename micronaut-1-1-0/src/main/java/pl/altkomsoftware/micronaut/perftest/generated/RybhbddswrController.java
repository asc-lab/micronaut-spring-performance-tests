package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rybhbddswr")
public class RybhbddswrController {

    private final RybhbddswrService rybhbddswrService;

    public RybhbddswrController(RybhbddswrService rybhbddswrService) {
        this.rybhbddswrService = rybhbddswrService;
    }

    @Get("/")
    public String index() {
        return rybhbddswrService.getGreeting();
    }
}
