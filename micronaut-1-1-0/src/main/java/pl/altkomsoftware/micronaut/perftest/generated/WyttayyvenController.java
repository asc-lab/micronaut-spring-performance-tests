package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wyttayyven")
public class WyttayyvenController {

    private final WyttayyvenService wyttayyvenService;

    public WyttayyvenController(WyttayyvenService wyttayyvenService) {
        this.wyttayyvenService = wyttayyvenService;
    }

    @Get("/")
    public String index() {
        return wyttayyvenService.getGreeting();
    }
}
