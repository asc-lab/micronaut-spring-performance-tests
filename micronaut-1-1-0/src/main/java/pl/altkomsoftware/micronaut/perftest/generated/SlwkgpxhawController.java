package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/slwkgpxhaw")
public class SlwkgpxhawController {

    private final SlwkgpxhawService slwkgpxhawService;

    public SlwkgpxhawController(SlwkgpxhawService slwkgpxhawService) {
        this.slwkgpxhawService = slwkgpxhawService;
    }

    @Get("/")
    public String index() {
        return slwkgpxhawService.getGreeting();
    }
}
