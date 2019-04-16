package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xtregmlkcq")
public class XtregmlkcqController {

    private final XtregmlkcqService xtregmlkcqService;

    public XtregmlkcqController(XtregmlkcqService xtregmlkcqService) {
        this.xtregmlkcqService = xtregmlkcqService;
    }

    @Get("/")
    public String index() {
        return xtregmlkcqService.getGreeting();
    }
}
