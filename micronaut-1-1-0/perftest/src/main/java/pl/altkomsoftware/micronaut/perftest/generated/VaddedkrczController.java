package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vaddedkrcz")
public class VaddedkrczController {

    private final VaddedkrczService vaddedkrczService;

    public VaddedkrczController(VaddedkrczService vaddedkrczService) {
        this.vaddedkrczService = vaddedkrczService;
    }

    @Get("/")
    public String index() {
        return vaddedkrczService.getGreeting();
    }
}
