package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xmizyoeaut")
public class XmizyoeautController {

    private final XmizyoeautService xmizyoeautService;

    public XmizyoeautController(XmizyoeautService xmizyoeautService) {
        this.xmizyoeautService = xmizyoeautService;
    }

    @Get("/")
    public String index() {
        return xmizyoeautService.getGreeting();
    }
}
