package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bxwmtyzuai")
public class BxwmtyzuaiController {

    private final BxwmtyzuaiService bxwmtyzuaiService;

    public BxwmtyzuaiController(BxwmtyzuaiService bxwmtyzuaiService) {
        this.bxwmtyzuaiService = bxwmtyzuaiService;
    }

    @Get("/")
    public String index() {
        return bxwmtyzuaiService.getGreeting();
    }
}
