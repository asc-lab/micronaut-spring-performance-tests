package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bwqgxxyokk")
public class BwqgxxyokkController {

    private final BwqgxxyokkService bwqgxxyokkService;

    public BwqgxxyokkController(BwqgxxyokkService bwqgxxyokkService) {
        this.bwqgxxyokkService = bwqgxxyokkService;
    }

    @Get("/")
    public String index() {
        return bwqgxxyokkService.getGreeting();
    }
}
