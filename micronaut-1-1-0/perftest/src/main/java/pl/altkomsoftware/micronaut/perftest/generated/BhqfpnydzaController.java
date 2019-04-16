package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bhqfpnydza")
public class BhqfpnydzaController {

    private final BhqfpnydzaService bhqfpnydzaService;

    public BhqfpnydzaController(BhqfpnydzaService bhqfpnydzaService) {
        this.bhqfpnydzaService = bhqfpnydzaService;
    }

    @Get("/")
    public String index() {
        return bhqfpnydzaService.getGreeting();
    }
}
