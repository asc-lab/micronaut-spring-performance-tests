package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hxiwtvjrbr")
public class HxiwtvjrbrController {

    private final HxiwtvjrbrService hxiwtvjrbrService;

    public HxiwtvjrbrController(HxiwtvjrbrService hxiwtvjrbrService) {
        this.hxiwtvjrbrService = hxiwtvjrbrService;
    }

    @Get("/")
    public String index() {
        return hxiwtvjrbrService.getGreeting();
    }
}
