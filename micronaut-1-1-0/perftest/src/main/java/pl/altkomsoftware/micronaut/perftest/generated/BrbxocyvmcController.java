package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/brbxocyvmc")
public class BrbxocyvmcController {

    private final BrbxocyvmcService brbxocyvmcService;

    public BrbxocyvmcController(BrbxocyvmcService brbxocyvmcService) {
        this.brbxocyvmcService = brbxocyvmcService;
    }

    @Get("/")
    public String index() {
        return brbxocyvmcService.getGreeting();
    }
}
