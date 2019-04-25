package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sousixgvsp")
public class SousixgvspController {

    private final SousixgvspService sousixgvspService;

    public SousixgvspController(SousixgvspService sousixgvspService) {
        this.sousixgvspService = sousixgvspService;
    }

    @Get("/")
    public String index() {
        return sousixgvspService.getGreeting();
    }
}
