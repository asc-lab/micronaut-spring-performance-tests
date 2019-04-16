package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xghzgfobzk")
public class XghzgfobzkController {

    private final XghzgfobzkService xghzgfobzkService;

    public XghzgfobzkController(XghzgfobzkService xghzgfobzkService) {
        this.xghzgfobzkService = xghzgfobzkService;
    }

    @Get("/")
    public String index() {
        return xghzgfobzkService.getGreeting();
    }
}
