package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xwoeifynpb")
public class XwoeifynpbController {

    private final XwoeifynpbService xwoeifynpbService;

    public XwoeifynpbController(XwoeifynpbService xwoeifynpbService) {
        this.xwoeifynpbService = xwoeifynpbService;
    }

    @Get("/")
    public String index() {
        return xwoeifynpbService.getGreeting();
    }
}
