package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sekaodncmd")
public class SekaodncmdController {

    private final SekaodncmdService sekaodncmdService;

    public SekaodncmdController(SekaodncmdService sekaodncmdService) {
        this.sekaodncmdService = sekaodncmdService;
    }

    @Get("/")
    public String index() {
        return sekaodncmdService.getGreeting();
    }
}
