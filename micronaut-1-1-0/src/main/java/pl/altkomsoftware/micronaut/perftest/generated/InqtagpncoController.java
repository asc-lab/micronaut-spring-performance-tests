package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/inqtagpnco")
public class InqtagpncoController {

    private final InqtagpncoService inqtagpncoService;

    public InqtagpncoController(InqtagpncoService inqtagpncoService) {
        this.inqtagpncoService = inqtagpncoService;
    }

    @Get("/")
    public String index() {
        return inqtagpncoService.getGreeting();
    }
}
