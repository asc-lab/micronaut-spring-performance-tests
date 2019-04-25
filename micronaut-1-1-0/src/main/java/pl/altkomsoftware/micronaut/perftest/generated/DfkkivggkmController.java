package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dfkkivggkm")
public class DfkkivggkmController {

    private final DfkkivggkmService dfkkivggkmService;

    public DfkkivggkmController(DfkkivggkmService dfkkivggkmService) {
        this.dfkkivggkmService = dfkkivggkmService;
    }

    @Get("/")
    public String index() {
        return dfkkivggkmService.getGreeting();
    }
}
