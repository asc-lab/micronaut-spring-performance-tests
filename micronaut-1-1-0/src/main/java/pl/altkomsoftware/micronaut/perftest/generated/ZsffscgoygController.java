package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zsffscgoyg")
public class ZsffscgoygController {

    private final ZsffscgoygService zsffscgoygService;

    public ZsffscgoygController(ZsffscgoygService zsffscgoygService) {
        this.zsffscgoygService = zsffscgoygService;
    }

    @Get("/")
    public String index() {
        return zsffscgoygService.getGreeting();
    }
}
