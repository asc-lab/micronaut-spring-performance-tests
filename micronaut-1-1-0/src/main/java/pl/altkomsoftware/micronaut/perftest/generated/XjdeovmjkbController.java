package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xjdeovmjkb")
public class XjdeovmjkbController {

    private final XjdeovmjkbService xjdeovmjkbService;

    public XjdeovmjkbController(XjdeovmjkbService xjdeovmjkbService) {
        this.xjdeovmjkbService = xjdeovmjkbService;
    }

    @Get("/")
    public String index() {
        return xjdeovmjkbService.getGreeting();
    }
}
