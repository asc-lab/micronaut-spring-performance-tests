package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eovzdobbcf")
public class EovzdobbcfController {

    private final EovzdobbcfService eovzdobbcfService;

    public EovzdobbcfController(EovzdobbcfService eovzdobbcfService) {
        this.eovzdobbcfService = eovzdobbcfService;
    }

    @Get("/")
    public String index() {
        return eovzdobbcfService.getGreeting();
    }
}
