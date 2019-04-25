package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/orqhhzdevp")
public class OrqhhzdevpController {

    private final OrqhhzdevpService orqhhzdevpService;

    public OrqhhzdevpController(OrqhhzdevpService orqhhzdevpService) {
        this.orqhhzdevpService = orqhhzdevpService;
    }

    @Get("/")
    public String index() {
        return orqhhzdevpService.getGreeting();
    }
}
