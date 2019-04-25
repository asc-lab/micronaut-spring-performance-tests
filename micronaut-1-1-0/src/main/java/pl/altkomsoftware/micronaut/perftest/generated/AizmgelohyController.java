package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aizmgelohy")
public class AizmgelohyController {

    private final AizmgelohyService aizmgelohyService;

    public AizmgelohyController(AizmgelohyService aizmgelohyService) {
        this.aizmgelohyService = aizmgelohyService;
    }

    @Get("/")
    public String index() {
        return aizmgelohyService.getGreeting();
    }
}
