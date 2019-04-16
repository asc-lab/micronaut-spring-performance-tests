package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gwnkhiybkg")
public class GwnkhiybkgController {

    private final GwnkhiybkgService gwnkhiybkgService;

    public GwnkhiybkgController(GwnkhiybkgService gwnkhiybkgService) {
        this.gwnkhiybkgService = gwnkhiybkgService;
    }

    @Get("/")
    public String index() {
        return gwnkhiybkgService.getGreeting();
    }
}
