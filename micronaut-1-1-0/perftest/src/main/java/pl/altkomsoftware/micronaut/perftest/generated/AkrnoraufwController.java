package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/akrnoraufw")
public class AkrnoraufwController {

    private final AkrnoraufwService akrnoraufwService;

    public AkrnoraufwController(AkrnoraufwService akrnoraufwService) {
        this.akrnoraufwService = akrnoraufwService;
    }

    @Get("/")
    public String index() {
        return akrnoraufwService.getGreeting();
    }
}
