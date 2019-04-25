package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wsesuohkwz")
public class WsesuohkwzController {

    private final WsesuohkwzService wsesuohkwzService;

    public WsesuohkwzController(WsesuohkwzService wsesuohkwzService) {
        this.wsesuohkwzService = wsesuohkwzService;
    }

    @Get("/")
    public String index() {
        return wsesuohkwzService.getGreeting();
    }
}
