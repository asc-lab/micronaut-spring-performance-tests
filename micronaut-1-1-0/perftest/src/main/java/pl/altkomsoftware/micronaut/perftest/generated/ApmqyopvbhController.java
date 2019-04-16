package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/apmqyopvbh")
public class ApmqyopvbhController {

    private final ApmqyopvbhService apmqyopvbhService;

    public ApmqyopvbhController(ApmqyopvbhService apmqyopvbhService) {
        this.apmqyopvbhService = apmqyopvbhService;
    }

    @Get("/")
    public String index() {
        return apmqyopvbhService.getGreeting();
    }
}
