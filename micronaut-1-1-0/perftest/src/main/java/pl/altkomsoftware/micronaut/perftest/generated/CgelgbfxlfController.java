package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cgelgbfxlf")
public class CgelgbfxlfController {

    private final CgelgbfxlfService cgelgbfxlfService;

    public CgelgbfxlfController(CgelgbfxlfService cgelgbfxlfService) {
        this.cgelgbfxlfService = cgelgbfxlfService;
    }

    @Get("/")
    public String index() {
        return cgelgbfxlfService.getGreeting();
    }
}
