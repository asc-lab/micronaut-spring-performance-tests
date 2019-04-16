package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wlflpxxrcj")
public class WlflpxxrcjController {

    private final WlflpxxrcjService wlflpxxrcjService;

    public WlflpxxrcjController(WlflpxxrcjService wlflpxxrcjService) {
        this.wlflpxxrcjService = wlflpxxrcjService;
    }

    @Get("/")
    public String index() {
        return wlflpxxrcjService.getGreeting();
    }
}
