package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yrrjoqdtmt")
public class YrrjoqdtmtController {

    private final YrrjoqdtmtService yrrjoqdtmtService;

    public YrrjoqdtmtController(YrrjoqdtmtService yrrjoqdtmtService) {
        this.yrrjoqdtmtService = yrrjoqdtmtService;
    }

    @Get("/")
    public String index() {
        return yrrjoqdtmtService.getGreeting();
    }
}
