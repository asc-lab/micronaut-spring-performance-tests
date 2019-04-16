package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/acovjrowfv")
public class AcovjrowfvController {

    private final AcovjrowfvService acovjrowfvService;

    public AcovjrowfvController(AcovjrowfvService acovjrowfvService) {
        this.acovjrowfvService = acovjrowfvService;
    }

    @Get("/")
    public String index() {
        return acovjrowfvService.getGreeting();
    }
}
