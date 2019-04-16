package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kzvfrrcliy")
public class KzvfrrcliyController {

    private final KzvfrrcliyService kzvfrrcliyService;

    public KzvfrrcliyController(KzvfrrcliyService kzvfrrcliyService) {
        this.kzvfrrcliyService = kzvfrrcliyService;
    }

    @Get("/")
    public String index() {
        return kzvfrrcliyService.getGreeting();
    }
}
