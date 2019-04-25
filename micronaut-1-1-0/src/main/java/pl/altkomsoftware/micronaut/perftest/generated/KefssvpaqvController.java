package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kefssvpaqv")
public class KefssvpaqvController {

    private final KefssvpaqvService kefssvpaqvService;

    public KefssvpaqvController(KefssvpaqvService kefssvpaqvService) {
        this.kefssvpaqvService = kefssvpaqvService;
    }

    @Get("/")
    public String index() {
        return kefssvpaqvService.getGreeting();
    }
}
