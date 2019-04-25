package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xrjcwozksh")
public class XrjcwozkshController {

    private final XrjcwozkshService xrjcwozkshService;

    public XrjcwozkshController(XrjcwozkshService xrjcwozkshService) {
        this.xrjcwozkshService = xrjcwozkshService;
    }

    @Get("/")
    public String index() {
        return xrjcwozkshService.getGreeting();
    }
}
