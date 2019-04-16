package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lozrocjlow")
public class LozrocjlowController {

    private final LozrocjlowService lozrocjlowService;

    public LozrocjlowController(LozrocjlowService lozrocjlowService) {
        this.lozrocjlowService = lozrocjlowService;
    }

    @Get("/")
    public String index() {
        return lozrocjlowService.getGreeting();
    }
}
