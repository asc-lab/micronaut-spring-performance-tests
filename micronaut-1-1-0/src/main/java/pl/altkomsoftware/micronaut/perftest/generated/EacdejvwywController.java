package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eacdejvwyw")
public class EacdejvwywController {

    private final EacdejvwywService eacdejvwywService;

    public EacdejvwywController(EacdejvwywService eacdejvwywService) {
        this.eacdejvwywService = eacdejvwywService;
    }

    @Get("/")
    public String index() {
        return eacdejvwywService.getGreeting();
    }
}
