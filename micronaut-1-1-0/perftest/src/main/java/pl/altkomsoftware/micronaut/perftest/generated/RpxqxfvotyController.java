package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rpxqxfvoty")
public class RpxqxfvotyController {

    private final RpxqxfvotyService rpxqxfvotyService;

    public RpxqxfvotyController(RpxqxfvotyService rpxqxfvotyService) {
        this.rpxqxfvotyService = rpxqxfvotyService;
    }

    @Get("/")
    public String index() {
        return rpxqxfvotyService.getGreeting();
    }
}
