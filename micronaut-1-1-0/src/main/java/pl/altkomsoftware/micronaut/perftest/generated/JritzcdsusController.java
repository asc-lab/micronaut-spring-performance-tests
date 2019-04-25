package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jritzcdsus")
public class JritzcdsusController {

    private final JritzcdsusService jritzcdsusService;

    public JritzcdsusController(JritzcdsusService jritzcdsusService) {
        this.jritzcdsusService = jritzcdsusService;
    }

    @Get("/")
    public String index() {
        return jritzcdsusService.getGreeting();
    }
}
