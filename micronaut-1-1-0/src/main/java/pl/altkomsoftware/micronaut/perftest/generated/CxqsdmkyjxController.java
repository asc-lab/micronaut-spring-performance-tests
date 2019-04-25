package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cxqsdmkyjx")
public class CxqsdmkyjxController {

    private final CxqsdmkyjxService cxqsdmkyjxService;

    public CxqsdmkyjxController(CxqsdmkyjxService cxqsdmkyjxService) {
        this.cxqsdmkyjxService = cxqsdmkyjxService;
    }

    @Get("/")
    public String index() {
        return cxqsdmkyjxService.getGreeting();
    }
}
