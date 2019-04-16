package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ubiepnctso")
public class UbiepnctsoController {

    private final UbiepnctsoService ubiepnctsoService;

    public UbiepnctsoController(UbiepnctsoService ubiepnctsoService) {
        this.ubiepnctsoService = ubiepnctsoService;
    }

    @Get("/")
    public String index() {
        return ubiepnctsoService.getGreeting();
    }
}
