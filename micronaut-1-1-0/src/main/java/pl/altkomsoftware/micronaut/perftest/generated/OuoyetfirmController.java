package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ouoyetfirm")
public class OuoyetfirmController {

    private final OuoyetfirmService ouoyetfirmService;

    public OuoyetfirmController(OuoyetfirmService ouoyetfirmService) {
        this.ouoyetfirmService = ouoyetfirmService;
    }

    @Get("/")
    public String index() {
        return ouoyetfirmService.getGreeting();
    }
}
