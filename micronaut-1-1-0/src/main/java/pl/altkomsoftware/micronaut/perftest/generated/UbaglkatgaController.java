package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ubaglkatga")
public class UbaglkatgaController {

    private final UbaglkatgaService ubaglkatgaService;

    public UbaglkatgaController(UbaglkatgaService ubaglkatgaService) {
        this.ubaglkatgaService = ubaglkatgaService;
    }

    @Get("/")
    public String index() {
        return ubaglkatgaService.getGreeting();
    }
}
