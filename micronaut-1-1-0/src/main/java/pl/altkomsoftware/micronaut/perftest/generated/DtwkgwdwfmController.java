package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dtwkgwdwfm")
public class DtwkgwdwfmController {

    private final DtwkgwdwfmService dtwkgwdwfmService;

    public DtwkgwdwfmController(DtwkgwdwfmService dtwkgwdwfmService) {
        this.dtwkgwdwfmService = dtwkgwdwfmService;
    }

    @Get("/")
    public String index() {
        return dtwkgwdwfmService.getGreeting();
    }
}
