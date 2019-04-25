package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xpapudayet")
public class XpapudayetController {

    private final XpapudayetService xpapudayetService;

    public XpapudayetController(XpapudayetService xpapudayetService) {
        this.xpapudayetService = xpapudayetService;
    }

    @Get("/")
    public String index() {
        return xpapudayetService.getGreeting();
    }
}
