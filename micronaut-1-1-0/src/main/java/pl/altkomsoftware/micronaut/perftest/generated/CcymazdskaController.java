package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ccymazdska")
public class CcymazdskaController {

    private final CcymazdskaService ccymazdskaService;

    public CcymazdskaController(CcymazdskaService ccymazdskaService) {
        this.ccymazdskaService = ccymazdskaService;
    }

    @Get("/")
    public String index() {
        return ccymazdskaService.getGreeting();
    }
}
