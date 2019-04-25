package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kojjnbuaql")
public class KojjnbuaqlController {

    private final KojjnbuaqlService kojjnbuaqlService;

    public KojjnbuaqlController(KojjnbuaqlService kojjnbuaqlService) {
        this.kojjnbuaqlService = kojjnbuaqlService;
    }

    @Get("/")
    public String index() {
        return kojjnbuaqlService.getGreeting();
    }
}
