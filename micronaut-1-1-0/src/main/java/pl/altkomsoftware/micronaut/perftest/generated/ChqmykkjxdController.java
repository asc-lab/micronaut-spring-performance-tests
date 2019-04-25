package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/chqmykkjxd")
public class ChqmykkjxdController {

    private final ChqmykkjxdService chqmykkjxdService;

    public ChqmykkjxdController(ChqmykkjxdService chqmykkjxdService) {
        this.chqmykkjxdService = chqmykkjxdService;
    }

    @Get("/")
    public String index() {
        return chqmykkjxdService.getGreeting();
    }
}
