package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/psaaoqjhqt")
public class PsaaoqjhqtController {

    private final PsaaoqjhqtService psaaoqjhqtService;

    public PsaaoqjhqtController(PsaaoqjhqtService psaaoqjhqtService) {
        this.psaaoqjhqtService = psaaoqjhqtService;
    }

    @Get("/")
    public String index() {
        return psaaoqjhqtService.getGreeting();
    }
}
