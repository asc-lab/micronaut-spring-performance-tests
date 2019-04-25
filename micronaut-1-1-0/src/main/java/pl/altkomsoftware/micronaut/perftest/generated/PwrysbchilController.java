package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pwrysbchil")
public class PwrysbchilController {

    private final PwrysbchilService pwrysbchilService;

    public PwrysbchilController(PwrysbchilService pwrysbchilService) {
        this.pwrysbchilService = pwrysbchilService;
    }

    @Get("/")
    public String index() {
        return pwrysbchilService.getGreeting();
    }
}
