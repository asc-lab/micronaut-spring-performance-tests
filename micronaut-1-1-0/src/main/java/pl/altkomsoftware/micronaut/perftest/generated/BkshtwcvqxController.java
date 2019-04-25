package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bkshtwcvqx")
public class BkshtwcvqxController {

    private final BkshtwcvqxService bkshtwcvqxService;

    public BkshtwcvqxController(BkshtwcvqxService bkshtwcvqxService) {
        this.bkshtwcvqxService = bkshtwcvqxService;
    }

    @Get("/")
    public String index() {
        return bkshtwcvqxService.getGreeting();
    }
}
