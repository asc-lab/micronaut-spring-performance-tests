package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/olygaykmxe")
public class OlygaykmxeController {

    private final OlygaykmxeService olygaykmxeService;

    public OlygaykmxeController(OlygaykmxeService olygaykmxeService) {
        this.olygaykmxeService = olygaykmxeService;
    }

    @Get("/")
    public String index() {
        return olygaykmxeService.getGreeting();
    }
}
