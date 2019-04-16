package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/swcdnnplrj")
public class SwcdnnplrjController {

    private final SwcdnnplrjService swcdnnplrjService;

    public SwcdnnplrjController(SwcdnnplrjService swcdnnplrjService) {
        this.swcdnnplrjService = swcdnnplrjService;
    }

    @Get("/")
    public String index() {
        return swcdnnplrjService.getGreeting();
    }
}
