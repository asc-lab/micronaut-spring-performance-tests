package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lzjmrkaajy")
public class LzjmrkaajyController {

    private final LzjmrkaajyService lzjmrkaajyService;

    public LzjmrkaajyController(LzjmrkaajyService lzjmrkaajyService) {
        this.lzjmrkaajyService = lzjmrkaajyService;
    }

    @Get("/")
    public String index() {
        return lzjmrkaajyService.getGreeting();
    }
}
