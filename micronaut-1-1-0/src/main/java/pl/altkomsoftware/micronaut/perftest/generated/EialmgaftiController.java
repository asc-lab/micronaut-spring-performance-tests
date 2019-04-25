package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eialmgafti")
public class EialmgaftiController {

    private final EialmgaftiService eialmgaftiService;

    public EialmgaftiController(EialmgaftiService eialmgaftiService) {
        this.eialmgaftiService = eialmgaftiService;
    }

    @Get("/")
    public String index() {
        return eialmgaftiService.getGreeting();
    }
}
