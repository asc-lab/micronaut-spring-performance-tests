package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oeygkarvzf")
public class OeygkarvzfController {

    private final OeygkarvzfService oeygkarvzfService;

    public OeygkarvzfController(OeygkarvzfService oeygkarvzfService) {
        this.oeygkarvzfService = oeygkarvzfService;
    }

    @Get("/")
    public String index() {
        return oeygkarvzfService.getGreeting();
    }
}
