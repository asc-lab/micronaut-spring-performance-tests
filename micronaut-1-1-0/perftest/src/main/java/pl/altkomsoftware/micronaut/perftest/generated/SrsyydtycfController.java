package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/srsyydtycf")
public class SrsyydtycfController {

    private final SrsyydtycfService srsyydtycfService;

    public SrsyydtycfController(SrsyydtycfService srsyydtycfService) {
        this.srsyydtycfService = srsyydtycfService;
    }

    @Get("/")
    public String index() {
        return srsyydtycfService.getGreeting();
    }
}
