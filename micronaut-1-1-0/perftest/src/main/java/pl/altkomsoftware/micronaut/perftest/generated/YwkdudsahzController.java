package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ywkdudsahz")
public class YwkdudsahzController {

    private final YwkdudsahzService ywkdudsahzService;

    public YwkdudsahzController(YwkdudsahzService ywkdudsahzService) {
        this.ywkdudsahzService = ywkdudsahzService;
    }

    @Get("/")
    public String index() {
        return ywkdudsahzService.getGreeting();
    }
}
