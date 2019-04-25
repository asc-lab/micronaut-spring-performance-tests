package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hkzacfibze")
public class HkzacfibzeController {

    private final HkzacfibzeService hkzacfibzeService;

    public HkzacfibzeController(HkzacfibzeService hkzacfibzeService) {
        this.hkzacfibzeService = hkzacfibzeService;
    }

    @Get("/")
    public String index() {
        return hkzacfibzeService.getGreeting();
    }
}
