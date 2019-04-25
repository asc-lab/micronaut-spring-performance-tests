package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xtrnxkparc")
public class XtrnxkparcController {

    private final XtrnxkparcService xtrnxkparcService;

    public XtrnxkparcController(XtrnxkparcService xtrnxkparcService) {
        this.xtrnxkparcService = xtrnxkparcService;
    }

    @Get("/")
    public String index() {
        return xtrnxkparcService.getGreeting();
    }
}
