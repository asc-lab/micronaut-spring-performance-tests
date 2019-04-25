package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oyylewyqus")
public class OyylewyqusController {

    private final OyylewyqusService oyylewyqusService;

    public OyylewyqusController(OyylewyqusService oyylewyqusService) {
        this.oyylewyqusService = oyylewyqusService;
    }

    @Get("/")
    public String index() {
        return oyylewyqusService.getGreeting();
    }
}
