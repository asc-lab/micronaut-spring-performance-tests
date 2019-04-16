package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xvxluafeog")
public class XvxluafeogController {

    private final XvxluafeogService xvxluafeogService;

    public XvxluafeogController(XvxluafeogService xvxluafeogService) {
        this.xvxluafeogService = xvxluafeogService;
    }

    @Get("/")
    public String index() {
        return xvxluafeogService.getGreeting();
    }
}
