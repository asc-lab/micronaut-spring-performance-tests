package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xjhxmxpsqg")
public class XjhxmxpsqgController {

    private final XjhxmxpsqgService xjhxmxpsqgService;

    public XjhxmxpsqgController(XjhxmxpsqgService xjhxmxpsqgService) {
        this.xjhxmxpsqgService = xjhxmxpsqgService;
    }

    @Get("/")
    public String index() {
        return xjhxmxpsqgService.getGreeting();
    }
}
