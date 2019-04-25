package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mhofigfzcx")
public class MhofigfzcxController {

    private final MhofigfzcxService mhofigfzcxService;

    public MhofigfzcxController(MhofigfzcxService mhofigfzcxService) {
        this.mhofigfzcxService = mhofigfzcxService;
    }

    @Get("/")
    public String index() {
        return mhofigfzcxService.getGreeting();
    }
}
