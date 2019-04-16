package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xnvizduuja")
public class XnvizduujaController {

    private final XnvizduujaService xnvizduujaService;

    public XnvizduujaController(XnvizduujaService xnvizduujaService) {
        this.xnvizduujaService = xnvizduujaService;
    }

    @Get("/")
    public String index() {
        return xnvizduujaService.getGreeting();
    }
}
