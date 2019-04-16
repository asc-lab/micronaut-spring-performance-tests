package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/crqzgrqfvs")
public class CrqzgrqfvsController {

    private final CrqzgrqfvsService crqzgrqfvsService;

    public CrqzgrqfvsController(CrqzgrqfvsService crqzgrqfvsService) {
        this.crqzgrqfvsService = crqzgrqfvsService;
    }

    @Get("/")
    public String index() {
        return crqzgrqfvsService.getGreeting();
    }
}
