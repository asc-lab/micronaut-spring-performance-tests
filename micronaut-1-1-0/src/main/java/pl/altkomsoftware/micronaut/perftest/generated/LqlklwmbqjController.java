package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lqlklwmbqj")
public class LqlklwmbqjController {

    private final LqlklwmbqjService lqlklwmbqjService;

    public LqlklwmbqjController(LqlklwmbqjService lqlklwmbqjService) {
        this.lqlklwmbqjService = lqlklwmbqjService;
    }

    @Get("/")
    public String index() {
        return lqlklwmbqjService.getGreeting();
    }
}
