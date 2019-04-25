package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ssjsofrvwr")
public class SsjsofrvwrController {

    private final SsjsofrvwrService ssjsofrvwrService;

    public SsjsofrvwrController(SsjsofrvwrService ssjsofrvwrService) {
        this.ssjsofrvwrService = ssjsofrvwrService;
    }

    @Get("/")
    public String index() {
        return ssjsofrvwrService.getGreeting();
    }
}
