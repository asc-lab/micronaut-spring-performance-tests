package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rksgcxvtap")
public class RksgcxvtapController {

    private final RksgcxvtapService rksgcxvtapService;

    public RksgcxvtapController(RksgcxvtapService rksgcxvtapService) {
        this.rksgcxvtapService = rksgcxvtapService;
    }

    @Get("/")
    public String index() {
        return rksgcxvtapService.getGreeting();
    }
}
