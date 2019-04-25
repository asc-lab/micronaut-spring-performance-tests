package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cccdfdudbb")
public class CccdfdudbbController {

    private final CccdfdudbbService cccdfdudbbService;

    public CccdfdudbbController(CccdfdudbbService cccdfdudbbService) {
        this.cccdfdudbbService = cccdfdudbbService;
    }

    @Get("/")
    public String index() {
        return cccdfdudbbService.getGreeting();
    }
}
