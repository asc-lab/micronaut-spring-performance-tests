package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/npnmwrbjdu")
public class NpnmwrbjduController {

    private final NpnmwrbjduService npnmwrbjduService;

    public NpnmwrbjduController(NpnmwrbjduService npnmwrbjduService) {
        this.npnmwrbjduService = npnmwrbjduService;
    }

    @Get("/")
    public String index() {
        return npnmwrbjduService.getGreeting();
    }
}
