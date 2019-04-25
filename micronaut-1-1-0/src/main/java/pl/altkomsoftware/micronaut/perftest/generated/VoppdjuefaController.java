package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/voppdjuefa")
public class VoppdjuefaController {

    private final VoppdjuefaService voppdjuefaService;

    public VoppdjuefaController(VoppdjuefaService voppdjuefaService) {
        this.voppdjuefaService = voppdjuefaService;
    }

    @Get("/")
    public String index() {
        return voppdjuefaService.getGreeting();
    }
}
