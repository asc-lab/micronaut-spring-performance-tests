package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xdypgwwsjl")
public class XdypgwwsjlController {

    private final XdypgwwsjlService xdypgwwsjlService;

    public XdypgwwsjlController(XdypgwwsjlService xdypgwwsjlService) {
        this.xdypgwwsjlService = xdypgwwsjlService;
    }

    @Get("/")
    public String index() {
        return xdypgwwsjlService.getGreeting();
    }
}
