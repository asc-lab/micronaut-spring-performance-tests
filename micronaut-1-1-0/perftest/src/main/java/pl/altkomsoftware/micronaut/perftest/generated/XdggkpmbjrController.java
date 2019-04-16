package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xdggkpmbjr")
public class XdggkpmbjrController {

    private final XdggkpmbjrService xdggkpmbjrService;

    public XdggkpmbjrController(XdggkpmbjrService xdggkpmbjrService) {
        this.xdggkpmbjrService = xdggkpmbjrService;
    }

    @Get("/")
    public String index() {
        return xdggkpmbjrService.getGreeting();
    }
}
