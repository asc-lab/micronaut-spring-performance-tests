package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oqwhpqybca")
public class OqwhpqybcaController {

    private final OqwhpqybcaService oqwhpqybcaService;

    public OqwhpqybcaController(OqwhpqybcaService oqwhpqybcaService) {
        this.oqwhpqybcaService = oqwhpqybcaService;
    }

    @Get("/")
    public String index() {
        return oqwhpqybcaService.getGreeting();
    }
}
