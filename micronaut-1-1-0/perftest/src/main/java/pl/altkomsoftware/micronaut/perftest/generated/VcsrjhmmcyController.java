package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vcsrjhmmcy")
public class VcsrjhmmcyController {

    private final VcsrjhmmcyService vcsrjhmmcyService;

    public VcsrjhmmcyController(VcsrjhmmcyService vcsrjhmmcyService) {
        this.vcsrjhmmcyService = vcsrjhmmcyService;
    }

    @Get("/")
    public String index() {
        return vcsrjhmmcyService.getGreeting();
    }
}
