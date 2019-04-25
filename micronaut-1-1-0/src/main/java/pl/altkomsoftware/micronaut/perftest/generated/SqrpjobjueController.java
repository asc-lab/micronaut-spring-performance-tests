package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sqrpjobjue")
public class SqrpjobjueController {

    private final SqrpjobjueService sqrpjobjueService;

    public SqrpjobjueController(SqrpjobjueService sqrpjobjueService) {
        this.sqrpjobjueService = sqrpjobjueService;
    }

    @Get("/")
    public String index() {
        return sqrpjobjueService.getGreeting();
    }
}
