package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xrzplntrzs")
public class XrzplntrzsController {

    private final XrzplntrzsService xrzplntrzsService;

    public XrzplntrzsController(XrzplntrzsService xrzplntrzsService) {
        this.xrzplntrzsService = xrzplntrzsService;
    }

    @Get("/")
    public String index() {
        return xrzplntrzsService.getGreeting();
    }
}
