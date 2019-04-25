package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xkdafyklsc")
public class XkdafyklscController {

    private final XkdafyklscService xkdafyklscService;

    public XkdafyklscController(XkdafyklscService xkdafyklscService) {
        this.xkdafyklscService = xkdafyklscService;
    }

    @Get("/")
    public String index() {
        return xkdafyklscService.getGreeting();
    }
}
