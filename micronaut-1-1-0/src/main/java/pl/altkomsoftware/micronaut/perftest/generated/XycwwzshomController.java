package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xycwwzshom")
public class XycwwzshomController {

    private final XycwwzshomService xycwwzshomService;

    public XycwwzshomController(XycwwzshomService xycwwzshomService) {
        this.xycwwzshomService = xycwwzshomService;
    }

    @Get("/")
    public String index() {
        return xycwwzshomService.getGreeting();
    }
}
