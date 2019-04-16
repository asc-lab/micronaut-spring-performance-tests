package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cfjnvlpwha")
public class CfjnvlpwhaController {

    private final CfjnvlpwhaService cfjnvlpwhaService;

    public CfjnvlpwhaController(CfjnvlpwhaService cfjnvlpwhaService) {
        this.cfjnvlpwhaService = cfjnvlpwhaService;
    }

    @Get("/")
    public String index() {
        return cfjnvlpwhaService.getGreeting();
    }
}
