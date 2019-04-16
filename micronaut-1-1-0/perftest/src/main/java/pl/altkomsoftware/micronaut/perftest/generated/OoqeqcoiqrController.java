package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ooqeqcoiqr")
public class OoqeqcoiqrController {

    private final OoqeqcoiqrService ooqeqcoiqrService;

    public OoqeqcoiqrController(OoqeqcoiqrService ooqeqcoiqrService) {
        this.ooqeqcoiqrService = ooqeqcoiqrService;
    }

    @Get("/")
    public String index() {
        return ooqeqcoiqrService.getGreeting();
    }
}
