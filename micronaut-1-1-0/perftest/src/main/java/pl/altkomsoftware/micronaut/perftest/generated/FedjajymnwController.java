package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fedjajymnw")
public class FedjajymnwController {

    private final FedjajymnwService fedjajymnwService;

    public FedjajymnwController(FedjajymnwService fedjajymnwService) {
        this.fedjajymnwService = fedjajymnwService;
    }

    @Get("/")
    public String index() {
        return fedjajymnwService.getGreeting();
    }
}
