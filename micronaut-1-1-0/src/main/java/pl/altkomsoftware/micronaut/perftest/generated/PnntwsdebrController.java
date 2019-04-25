package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pnntwsdebr")
public class PnntwsdebrController {

    private final PnntwsdebrService pnntwsdebrService;

    public PnntwsdebrController(PnntwsdebrService pnntwsdebrService) {
        this.pnntwsdebrService = pnntwsdebrService;
    }

    @Get("/")
    public String index() {
        return pnntwsdebrService.getGreeting();
    }
}
