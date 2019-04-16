package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xwpmxbtikt")
public class XwpmxbtiktController {

    private final XwpmxbtiktService xwpmxbtiktService;

    public XwpmxbtiktController(XwpmxbtiktService xwpmxbtiktService) {
        this.xwpmxbtiktService = xwpmxbtiktService;
    }

    @Get("/")
    public String index() {
        return xwpmxbtiktService.getGreeting();
    }
}
