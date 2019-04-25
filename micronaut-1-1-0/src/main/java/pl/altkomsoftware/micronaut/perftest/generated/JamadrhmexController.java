package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jamadrhmex")
public class JamadrhmexController {

    private final JamadrhmexService jamadrhmexService;

    public JamadrhmexController(JamadrhmexService jamadrhmexService) {
        this.jamadrhmexService = jamadrhmexService;
    }

    @Get("/")
    public String index() {
        return jamadrhmexService.getGreeting();
    }
}
