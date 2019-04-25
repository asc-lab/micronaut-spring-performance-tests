package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xenzcbuysb")
public class XenzcbuysbController {

    private final XenzcbuysbService xenzcbuysbService;

    public XenzcbuysbController(XenzcbuysbService xenzcbuysbService) {
        this.xenzcbuysbService = xenzcbuysbService;
    }

    @Get("/")
    public String index() {
        return xenzcbuysbService.getGreeting();
    }
}
