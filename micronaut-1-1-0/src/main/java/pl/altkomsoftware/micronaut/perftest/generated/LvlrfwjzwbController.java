package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lvlrfwjzwb")
public class LvlrfwjzwbController {

    private final LvlrfwjzwbService lvlrfwjzwbService;

    public LvlrfwjzwbController(LvlrfwjzwbService lvlrfwjzwbService) {
        this.lvlrfwjzwbService = lvlrfwjzwbService;
    }

    @Get("/")
    public String index() {
        return lvlrfwjzwbService.getGreeting();
    }
}
