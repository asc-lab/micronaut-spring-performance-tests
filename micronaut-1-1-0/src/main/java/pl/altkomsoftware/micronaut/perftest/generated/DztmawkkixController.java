package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dztmawkkix")
public class DztmawkkixController {

    private final DztmawkkixService dztmawkkixService;

    public DztmawkkixController(DztmawkkixService dztmawkkixService) {
        this.dztmawkkixService = dztmawkkixService;
    }

    @Get("/")
    public String index() {
        return dztmawkkixService.getGreeting();
    }
}
