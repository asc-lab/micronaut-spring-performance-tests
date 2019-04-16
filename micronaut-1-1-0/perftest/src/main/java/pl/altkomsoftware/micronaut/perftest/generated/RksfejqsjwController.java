package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rksfejqsjw")
public class RksfejqsjwController {

    private final RksfejqsjwService rksfejqsjwService;

    public RksfejqsjwController(RksfejqsjwService rksfejqsjwService) {
        this.rksfejqsjwService = rksfejqsjwService;
    }

    @Get("/")
    public String index() {
        return rksfejqsjwService.getGreeting();
    }
}
