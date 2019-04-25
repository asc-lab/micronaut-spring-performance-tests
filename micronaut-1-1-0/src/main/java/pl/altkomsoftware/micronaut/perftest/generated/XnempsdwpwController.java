package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xnempsdwpw")
public class XnempsdwpwController {

    private final XnempsdwpwService xnempsdwpwService;

    public XnempsdwpwController(XnempsdwpwService xnempsdwpwService) {
        this.xnempsdwpwService = xnempsdwpwService;
    }

    @Get("/")
    public String index() {
        return xnempsdwpwService.getGreeting();
    }
}
