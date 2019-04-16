package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bwgswhmstl")
public class BwgswhmstlController {

    private final BwgswhmstlService bwgswhmstlService;

    public BwgswhmstlController(BwgswhmstlService bwgswhmstlService) {
        this.bwgswhmstlService = bwgswhmstlService;
    }

    @Get("/")
    public String index() {
        return bwgswhmstlService.getGreeting();
    }
}
