package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cfhsurpuxc")
public class CfhsurpuxcController {

    private final CfhsurpuxcService cfhsurpuxcService;

    public CfhsurpuxcController(CfhsurpuxcService cfhsurpuxcService) {
        this.cfhsurpuxcService = cfhsurpuxcService;
    }

    @Get("/")
    public String index() {
        return cfhsurpuxcService.getGreeting();
    }
}
