package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/odkdzubcbl")
public class OdkdzubcblController {

    private final OdkdzubcblService odkdzubcblService;

    public OdkdzubcblController(OdkdzubcblService odkdzubcblService) {
        this.odkdzubcblService = odkdzubcblService;
    }

    @Get("/")
    public String index() {
        return odkdzubcblService.getGreeting();
    }
}
