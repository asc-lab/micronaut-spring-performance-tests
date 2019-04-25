package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bdlswdshmq")
public class BdlswdshmqController {

    private final BdlswdshmqService bdlswdshmqService;

    public BdlswdshmqController(BdlswdshmqService bdlswdshmqService) {
        this.bdlswdshmqService = bdlswdshmqService;
    }

    @Get("/")
    public String index() {
        return bdlswdshmqService.getGreeting();
    }
}
