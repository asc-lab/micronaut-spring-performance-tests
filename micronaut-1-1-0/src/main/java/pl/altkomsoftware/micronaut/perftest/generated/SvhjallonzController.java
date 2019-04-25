package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/svhjallonz")
public class SvhjallonzController {

    private final SvhjallonzService svhjallonzService;

    public SvhjallonzController(SvhjallonzService svhjallonzService) {
        this.svhjallonzService = svhjallonzService;
    }

    @Get("/")
    public String index() {
        return svhjallonzService.getGreeting();
    }
}
