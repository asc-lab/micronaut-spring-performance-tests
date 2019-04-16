package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rmollcoojd")
public class RmollcoojdController {

    private final RmollcoojdService rmollcoojdService;

    public RmollcoojdController(RmollcoojdService rmollcoojdService) {
        this.rmollcoojdService = rmollcoojdService;
    }

    @Get("/")
    public String index() {
        return rmollcoojdService.getGreeting();
    }
}
