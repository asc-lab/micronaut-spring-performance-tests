package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/adnfanqojd")
public class AdnfanqojdController {

    private final AdnfanqojdService adnfanqojdService;

    public AdnfanqojdController(AdnfanqojdService adnfanqojdService) {
        this.adnfanqojdService = adnfanqojdService;
    }

    @Get("/")
    public String index() {
        return adnfanqojdService.getGreeting();
    }
}
