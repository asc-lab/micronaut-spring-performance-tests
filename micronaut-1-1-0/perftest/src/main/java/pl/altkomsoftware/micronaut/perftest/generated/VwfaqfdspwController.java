package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vwfaqfdspw")
public class VwfaqfdspwController {

    private final VwfaqfdspwService vwfaqfdspwService;

    public VwfaqfdspwController(VwfaqfdspwService vwfaqfdspwService) {
        this.vwfaqfdspwService = vwfaqfdspwService;
    }

    @Get("/")
    public String index() {
        return vwfaqfdspwService.getGreeting();
    }
}
