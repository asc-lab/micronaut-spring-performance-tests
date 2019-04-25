package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sehjcgipcd")
public class SehjcgipcdController {

    private final SehjcgipcdService sehjcgipcdService;

    public SehjcgipcdController(SehjcgipcdService sehjcgipcdService) {
        this.sehjcgipcdService = sehjcgipcdService;
    }

    @Get("/")
    public String index() {
        return sehjcgipcdService.getGreeting();
    }
}
