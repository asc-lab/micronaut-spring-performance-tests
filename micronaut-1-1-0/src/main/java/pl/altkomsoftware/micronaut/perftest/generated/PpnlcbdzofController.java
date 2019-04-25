package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ppnlcbdzof")
public class PpnlcbdzofController {

    private final PpnlcbdzofService ppnlcbdzofService;

    public PpnlcbdzofController(PpnlcbdzofService ppnlcbdzofService) {
        this.ppnlcbdzofService = ppnlcbdzofService;
    }

    @Get("/")
    public String index() {
        return ppnlcbdzofService.getGreeting();
    }
}
