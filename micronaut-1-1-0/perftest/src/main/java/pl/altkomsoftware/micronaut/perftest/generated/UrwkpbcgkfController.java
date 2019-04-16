package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/urwkpbcgkf")
public class UrwkpbcgkfController {

    private final UrwkpbcgkfService urwkpbcgkfService;

    public UrwkpbcgkfController(UrwkpbcgkfService urwkpbcgkfService) {
        this.urwkpbcgkfService = urwkpbcgkfService;
    }

    @Get("/")
    public String index() {
        return urwkpbcgkfService.getGreeting();
    }
}
