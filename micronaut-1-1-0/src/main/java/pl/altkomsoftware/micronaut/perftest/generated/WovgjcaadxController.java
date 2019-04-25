package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wovgjcaadx")
public class WovgjcaadxController {

    private final WovgjcaadxService wovgjcaadxService;

    public WovgjcaadxController(WovgjcaadxService wovgjcaadxService) {
        this.wovgjcaadxService = wovgjcaadxService;
    }

    @Get("/")
    public String index() {
        return wovgjcaadxService.getGreeting();
    }
}
