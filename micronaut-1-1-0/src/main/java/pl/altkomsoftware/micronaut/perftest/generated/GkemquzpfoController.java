package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gkemquzpfo")
public class GkemquzpfoController {

    private final GkemquzpfoService gkemquzpfoService;

    public GkemquzpfoController(GkemquzpfoService gkemquzpfoService) {
        this.gkemquzpfoService = gkemquzpfoService;
    }

    @Get("/")
    public String index() {
        return gkemquzpfoService.getGreeting();
    }
}
