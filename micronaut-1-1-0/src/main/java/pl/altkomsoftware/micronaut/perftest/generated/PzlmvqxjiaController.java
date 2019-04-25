package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pzlmvqxjia")
public class PzlmvqxjiaController {

    private final PzlmvqxjiaService pzlmvqxjiaService;

    public PzlmvqxjiaController(PzlmvqxjiaService pzlmvqxjiaService) {
        this.pzlmvqxjiaService = pzlmvqxjiaService;
    }

    @Get("/")
    public String index() {
        return pzlmvqxjiaService.getGreeting();
    }
}
