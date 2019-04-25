package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ghbfmvrntl")
public class GhbfmvrntlController {

    private final GhbfmvrntlService ghbfmvrntlService;

    public GhbfmvrntlController(GhbfmvrntlService ghbfmvrntlService) {
        this.ghbfmvrntlService = ghbfmvrntlService;
    }

    @Get("/")
    public String index() {
        return ghbfmvrntlService.getGreeting();
    }
}
