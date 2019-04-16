package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tdrurimbkw")
public class TdrurimbkwController {

    private final TdrurimbkwService tdrurimbkwService;

    public TdrurimbkwController(TdrurimbkwService tdrurimbkwService) {
        this.tdrurimbkwService = tdrurimbkwService;
    }

    @Get("/")
    public String index() {
        return tdrurimbkwService.getGreeting();
    }
}
