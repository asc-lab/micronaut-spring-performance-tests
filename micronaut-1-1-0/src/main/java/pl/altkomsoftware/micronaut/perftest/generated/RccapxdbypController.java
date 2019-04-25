package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rccapxdbyp")
public class RccapxdbypController {

    private final RccapxdbypService rccapxdbypService;

    public RccapxdbypController(RccapxdbypService rccapxdbypService) {
        this.rccapxdbypService = rccapxdbypService;
    }

    @Get("/")
    public String index() {
        return rccapxdbypService.getGreeting();
    }
}
