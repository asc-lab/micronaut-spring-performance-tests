package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nagbmkbwir")
public class NagbmkbwirController {

    private final NagbmkbwirService nagbmkbwirService;

    public NagbmkbwirController(NagbmkbwirService nagbmkbwirService) {
        this.nagbmkbwirService = nagbmkbwirService;
    }

    @Get("/")
    public String index() {
        return nagbmkbwirService.getGreeting();
    }
}
