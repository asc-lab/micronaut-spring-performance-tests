package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fmrnrcicsp")
public class FmrnrcicspController {

    private final FmrnrcicspService fmrnrcicspService;

    public FmrnrcicspController(FmrnrcicspService fmrnrcicspService) {
        this.fmrnrcicspService = fmrnrcicspService;
    }

    @Get("/")
    public String index() {
        return fmrnrcicspService.getGreeting();
    }
}
