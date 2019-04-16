package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cqywifyngd")
public class CqywifyngdController {

    private final CqywifyngdService cqywifyngdService;

    public CqywifyngdController(CqywifyngdService cqywifyngdService) {
        this.cqywifyngdService = cqywifyngdService;
    }

    @Get("/")
    public String index() {
        return cqywifyngdService.getGreeting();
    }
}
