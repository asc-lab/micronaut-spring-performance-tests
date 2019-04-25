package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bfaxlanuso")
public class BfaxlanusoController {

    private final BfaxlanusoService bfaxlanusoService;

    public BfaxlanusoController(BfaxlanusoService bfaxlanusoService) {
        this.bfaxlanusoService = bfaxlanusoService;
    }

    @Get("/")
    public String index() {
        return bfaxlanusoService.getGreeting();
    }
}
