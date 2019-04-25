package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cohvrxaheo")
public class CohvrxaheoController {

    private final CohvrxaheoService cohvrxaheoService;

    public CohvrxaheoController(CohvrxaheoService cohvrxaheoService) {
        this.cohvrxaheoService = cohvrxaheoService;
    }

    @Get("/")
    public String index() {
        return cohvrxaheoService.getGreeting();
    }
}
