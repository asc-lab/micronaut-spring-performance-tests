package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xxucauaxtz")
public class XxucauaxtzController {

    private final XxucauaxtzService xxucauaxtzService;

    public XxucauaxtzController(XxucauaxtzService xxucauaxtzService) {
        this.xxucauaxtzService = xxucauaxtzService;
    }

    @Get("/")
    public String index() {
        return xxucauaxtzService.getGreeting();
    }
}
