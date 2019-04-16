package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yrwketjmah")
public class YrwketjmahController {

    private final YrwketjmahService yrwketjmahService;

    public YrwketjmahController(YrwketjmahService yrwketjmahService) {
        this.yrwketjmahService = yrwketjmahService;
    }

    @Get("/")
    public String index() {
        return yrwketjmahService.getGreeting();
    }
}
