package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oyavubbkfo")
public class OyavubbkfoController {

    private final OyavubbkfoService oyavubbkfoService;

    public OyavubbkfoController(OyavubbkfoService oyavubbkfoService) {
        this.oyavubbkfoService = oyavubbkfoService;
    }

    @Get("/")
    public String index() {
        return oyavubbkfoService.getGreeting();
    }
}
