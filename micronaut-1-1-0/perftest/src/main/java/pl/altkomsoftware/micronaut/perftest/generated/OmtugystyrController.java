package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/omtugystyr")
public class OmtugystyrController {

    private final OmtugystyrService omtugystyrService;

    public OmtugystyrController(OmtugystyrService omtugystyrService) {
        this.omtugystyrService = omtugystyrService;
    }

    @Get("/")
    public String index() {
        return omtugystyrService.getGreeting();
    }
}
