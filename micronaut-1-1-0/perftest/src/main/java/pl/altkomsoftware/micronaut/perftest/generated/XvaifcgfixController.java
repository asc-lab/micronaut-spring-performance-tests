package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xvaifcgfix")
public class XvaifcgfixController {

    private final XvaifcgfixService xvaifcgfixService;

    public XvaifcgfixController(XvaifcgfixService xvaifcgfixService) {
        this.xvaifcgfixService = xvaifcgfixService;
    }

    @Get("/")
    public String index() {
        return xvaifcgfixService.getGreeting();
    }
}
