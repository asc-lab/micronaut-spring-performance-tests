package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rfozmkrexo")
public class RfozmkrexoController {

    private final RfozmkrexoService rfozmkrexoService;

    public RfozmkrexoController(RfozmkrexoService rfozmkrexoService) {
        this.rfozmkrexoService = rfozmkrexoService;
    }

    @Get("/")
    public String index() {
        return rfozmkrexoService.getGreeting();
    }
}
