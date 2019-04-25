package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ctkavcolrp")
public class CtkavcolrpController {

    private final CtkavcolrpService ctkavcolrpService;

    public CtkavcolrpController(CtkavcolrpService ctkavcolrpService) {
        this.ctkavcolrpService = ctkavcolrpService;
    }

    @Get("/")
    public String index() {
        return ctkavcolrpService.getGreeting();
    }
}
