package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wmkfgbdtmv")
public class WmkfgbdtmvController {

    private final WmkfgbdtmvService wmkfgbdtmvService;

    public WmkfgbdtmvController(WmkfgbdtmvService wmkfgbdtmvService) {
        this.wmkfgbdtmvService = wmkfgbdtmvService;
    }

    @Get("/")
    public String index() {
        return wmkfgbdtmvService.getGreeting();
    }
}
