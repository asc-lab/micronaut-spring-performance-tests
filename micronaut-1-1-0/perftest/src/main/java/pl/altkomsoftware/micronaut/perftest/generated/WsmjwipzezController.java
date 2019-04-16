package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wsmjwipzez")
public class WsmjwipzezController {

    private final WsmjwipzezService wsmjwipzezService;

    public WsmjwipzezController(WsmjwipzezService wsmjwipzezService) {
        this.wsmjwipzezService = wsmjwipzezService;
    }

    @Get("/")
    public String index() {
        return wsmjwipzezService.getGreeting();
    }
}
