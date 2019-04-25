package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yejhuzifsv")
public class YejhuzifsvController {

    private final YejhuzifsvService yejhuzifsvService;

    public YejhuzifsvController(YejhuzifsvService yejhuzifsvService) {
        this.yejhuzifsvService = yejhuzifsvService;
    }

    @Get("/")
    public String index() {
        return yejhuzifsvService.getGreeting();
    }
}
