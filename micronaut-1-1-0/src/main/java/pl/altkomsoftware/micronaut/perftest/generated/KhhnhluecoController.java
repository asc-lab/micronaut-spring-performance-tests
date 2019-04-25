package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/khhnhlueco")
public class KhhnhluecoController {

    private final KhhnhluecoService khhnhluecoService;

    public KhhnhluecoController(KhhnhluecoService khhnhluecoService) {
        this.khhnhluecoService = khhnhluecoService;
    }

    @Get("/")
    public String index() {
        return khhnhluecoService.getGreeting();
    }
}
