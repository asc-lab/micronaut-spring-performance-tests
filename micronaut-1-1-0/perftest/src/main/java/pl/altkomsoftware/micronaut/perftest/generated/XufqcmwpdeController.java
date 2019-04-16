package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xufqcmwpde")
public class XufqcmwpdeController {

    private final XufqcmwpdeService xufqcmwpdeService;

    public XufqcmwpdeController(XufqcmwpdeService xufqcmwpdeService) {
        this.xufqcmwpdeService = xufqcmwpdeService;
    }

    @Get("/")
    public String index() {
        return xufqcmwpdeService.getGreeting();
    }
}
