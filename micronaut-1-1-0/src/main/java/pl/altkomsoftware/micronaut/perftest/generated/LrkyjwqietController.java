package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lrkyjwqiet")
public class LrkyjwqietController {

    private final LrkyjwqietService lrkyjwqietService;

    public LrkyjwqietController(LrkyjwqietService lrkyjwqietService) {
        this.lrkyjwqietService = lrkyjwqietService;
    }

    @Get("/")
    public String index() {
        return lrkyjwqietService.getGreeting();
    }
}
