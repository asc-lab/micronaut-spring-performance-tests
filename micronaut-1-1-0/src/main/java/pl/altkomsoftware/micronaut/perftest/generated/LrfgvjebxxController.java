package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lrfgvjebxx")
public class LrfgvjebxxController {

    private final LrfgvjebxxService lrfgvjebxxService;

    public LrfgvjebxxController(LrfgvjebxxService lrfgvjebxxService) {
        this.lrfgvjebxxService = lrfgvjebxxService;
    }

    @Get("/")
    public String index() {
        return lrfgvjebxxService.getGreeting();
    }
}
