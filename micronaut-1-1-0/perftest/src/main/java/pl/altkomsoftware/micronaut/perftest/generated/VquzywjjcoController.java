package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vquzywjjco")
public class VquzywjjcoController {

    private final VquzywjjcoService vquzywjjcoService;

    public VquzywjjcoController(VquzywjjcoService vquzywjjcoService) {
        this.vquzywjjcoService = vquzywjjcoService;
    }

    @Get("/")
    public String index() {
        return vquzywjjcoService.getGreeting();
    }
}
