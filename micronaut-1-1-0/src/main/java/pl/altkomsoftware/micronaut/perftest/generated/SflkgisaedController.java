package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sflkgisaed")
public class SflkgisaedController {

    private final SflkgisaedService sflkgisaedService;

    public SflkgisaedController(SflkgisaedService sflkgisaedService) {
        this.sflkgisaedService = sflkgisaedService;
    }

    @Get("/")
    public String index() {
        return sflkgisaedService.getGreeting();
    }
}
