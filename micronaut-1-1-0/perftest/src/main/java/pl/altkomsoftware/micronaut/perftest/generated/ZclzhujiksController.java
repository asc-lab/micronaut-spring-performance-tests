package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zclzhujiks")
public class ZclzhujiksController {

    private final ZclzhujiksService zclzhujiksService;

    public ZclzhujiksController(ZclzhujiksService zclzhujiksService) {
        this.zclzhujiksService = zclzhujiksService;
    }

    @Get("/")
    public String index() {
        return zclzhujiksService.getGreeting();
    }
}
