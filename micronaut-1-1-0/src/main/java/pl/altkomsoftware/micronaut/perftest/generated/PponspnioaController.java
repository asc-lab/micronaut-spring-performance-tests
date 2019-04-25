package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pponspnioa")
public class PponspnioaController {

    private final PponspnioaService pponspnioaService;

    public PponspnioaController(PponspnioaService pponspnioaService) {
        this.pponspnioaService = pponspnioaService;
    }

    @Get("/")
    public String index() {
        return pponspnioaService.getGreeting();
    }
}
