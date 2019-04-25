package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tergymcxht")
public class TergymcxhtController {

    private final TergymcxhtService tergymcxhtService;

    public TergymcxhtController(TergymcxhtService tergymcxhtService) {
        this.tergymcxhtService = tergymcxhtService;
    }

    @Get("/")
    public String index() {
        return tergymcxhtService.getGreeting();
    }
}
