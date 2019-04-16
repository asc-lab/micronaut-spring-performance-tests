package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eankrrmukv")
public class EankrrmukvController {

    private final EankrrmukvService eankrrmukvService;

    public EankrrmukvController(EankrrmukvService eankrrmukvService) {
        this.eankrrmukvService = eankrrmukvService;
    }

    @Get("/")
    public String index() {
        return eankrrmukvService.getGreeting();
    }
}
