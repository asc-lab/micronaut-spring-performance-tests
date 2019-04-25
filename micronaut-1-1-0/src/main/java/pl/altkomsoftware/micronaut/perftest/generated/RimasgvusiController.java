package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rimasgvusi")
public class RimasgvusiController {

    private final RimasgvusiService rimasgvusiService;

    public RimasgvusiController(RimasgvusiService rimasgvusiService) {
        this.rimasgvusiService = rimasgvusiService;
    }

    @Get("/")
    public String index() {
        return rimasgvusiService.getGreeting();
    }
}
