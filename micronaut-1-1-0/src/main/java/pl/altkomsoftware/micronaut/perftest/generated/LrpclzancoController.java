package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lrpclzanco")
public class LrpclzancoController {

    private final LrpclzancoService lrpclzancoService;

    public LrpclzancoController(LrpclzancoService lrpclzancoService) {
        this.lrpclzancoService = lrpclzancoService;
    }

    @Get("/")
    public String index() {
        return lrpclzancoService.getGreeting();
    }
}
