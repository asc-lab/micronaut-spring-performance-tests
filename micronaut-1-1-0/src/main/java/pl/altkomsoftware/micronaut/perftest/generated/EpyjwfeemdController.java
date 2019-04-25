package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/epyjwfeemd")
public class EpyjwfeemdController {

    private final EpyjwfeemdService epyjwfeemdService;

    public EpyjwfeemdController(EpyjwfeemdService epyjwfeemdService) {
        this.epyjwfeemdService = epyjwfeemdService;
    }

    @Get("/")
    public String index() {
        return epyjwfeemdService.getGreeting();
    }
}
