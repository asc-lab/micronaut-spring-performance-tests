package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dmyjanrnsg")
public class DmyjanrnsgController {

    private final DmyjanrnsgService dmyjanrnsgService;

    public DmyjanrnsgController(DmyjanrnsgService dmyjanrnsgService) {
        this.dmyjanrnsgService = dmyjanrnsgService;
    }

    @Get("/")
    public String index() {
        return dmyjanrnsgService.getGreeting();
    }
}
