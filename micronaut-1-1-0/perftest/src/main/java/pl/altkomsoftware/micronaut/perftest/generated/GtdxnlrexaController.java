package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gtdxnlrexa")
public class GtdxnlrexaController {

    private final GtdxnlrexaService gtdxnlrexaService;

    public GtdxnlrexaController(GtdxnlrexaService gtdxnlrexaService) {
        this.gtdxnlrexaService = gtdxnlrexaService;
    }

    @Get("/")
    public String index() {
        return gtdxnlrexaService.getGreeting();
    }
}
