package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rrxosajwir")
public class RrxosajwirController {

    private final RrxosajwirService rrxosajwirService;

    public RrxosajwirController(RrxosajwirService rrxosajwirService) {
        this.rrxosajwirService = rrxosajwirService;
    }

    @Get("/")
    public String index() {
        return rrxosajwirService.getGreeting();
    }
}
