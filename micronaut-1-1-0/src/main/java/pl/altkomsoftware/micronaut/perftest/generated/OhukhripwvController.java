package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ohukhripwv")
public class OhukhripwvController {

    private final OhukhripwvService ohukhripwvService;

    public OhukhripwvController(OhukhripwvService ohukhripwvService) {
        this.ohukhripwvService = ohukhripwvService;
    }

    @Get("/")
    public String index() {
        return ohukhripwvService.getGreeting();
    }
}
