package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/coxookpczq")
public class CoxookpczqController {

    private final CoxookpczqService coxookpczqService;

    public CoxookpczqController(CoxookpczqService coxookpczqService) {
        this.coxookpczqService = coxookpczqService;
    }

    @Get("/")
    public String index() {
        return coxookpczqService.getGreeting();
    }
}
