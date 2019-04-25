package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xbtqzipjmj")
public class XbtqzipjmjController {

    private final XbtqzipjmjService xbtqzipjmjService;

    public XbtqzipjmjController(XbtqzipjmjService xbtqzipjmjService) {
        this.xbtqzipjmjService = xbtqzipjmjService;
    }

    @Get("/")
    public String index() {
        return xbtqzipjmjService.getGreeting();
    }
}
