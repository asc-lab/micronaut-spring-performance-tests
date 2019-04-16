package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xdrkcyvzwn")
public class XdrkcyvzwnController {

    private final XdrkcyvzwnService xdrkcyvzwnService;

    public XdrkcyvzwnController(XdrkcyvzwnService xdrkcyvzwnService) {
        this.xdrkcyvzwnService = xdrkcyvzwnService;
    }

    @Get("/")
    public String index() {
        return xdrkcyvzwnService.getGreeting();
    }
}
