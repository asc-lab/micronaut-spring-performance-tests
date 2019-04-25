package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xqslwycgcb")
public class XqslwycgcbController {

    private final XqslwycgcbService xqslwycgcbService;

    public XqslwycgcbController(XqslwycgcbService xqslwycgcbService) {
        this.xqslwycgcbService = xqslwycgcbService;
    }

    @Get("/")
    public String index() {
        return xqslwycgcbService.getGreeting();
    }
}
