package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/czqxjrnhst")
public class CzqxjrnhstController {

    private final CzqxjrnhstService czqxjrnhstService;

    public CzqxjrnhstController(CzqxjrnhstService czqxjrnhstService) {
        this.czqxjrnhstService = czqxjrnhstService;
    }

    @Get("/")
    public String index() {
        return czqxjrnhstService.getGreeting();
    }
}
