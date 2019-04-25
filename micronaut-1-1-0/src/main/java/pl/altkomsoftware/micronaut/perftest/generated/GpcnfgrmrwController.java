package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gpcnfgrmrw")
public class GpcnfgrmrwController {

    private final GpcnfgrmrwService gpcnfgrmrwService;

    public GpcnfgrmrwController(GpcnfgrmrwService gpcnfgrmrwService) {
        this.gpcnfgrmrwService = gpcnfgrmrwService;
    }

    @Get("/")
    public String index() {
        return gpcnfgrmrwService.getGreeting();
    }
}
