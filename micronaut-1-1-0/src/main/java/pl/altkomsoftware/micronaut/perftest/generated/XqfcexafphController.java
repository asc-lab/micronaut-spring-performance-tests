package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xqfcexafph")
public class XqfcexafphController {

    private final XqfcexafphService xqfcexafphService;

    public XqfcexafphController(XqfcexafphService xqfcexafphService) {
        this.xqfcexafphService = xqfcexafphService;
    }

    @Get("/")
    public String index() {
        return xqfcexafphService.getGreeting();
    }
}
