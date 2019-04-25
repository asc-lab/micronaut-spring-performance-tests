package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cbtumgeqao")
public class CbtumgeqaoController {

    private final CbtumgeqaoService cbtumgeqaoService;

    public CbtumgeqaoController(CbtumgeqaoService cbtumgeqaoService) {
        this.cbtumgeqaoService = cbtumgeqaoService;
    }

    @Get("/")
    public String index() {
        return cbtumgeqaoService.getGreeting();
    }
}
