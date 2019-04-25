package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/whulpqozcq")
public class WhulpqozcqController {

    private final WhulpqozcqService whulpqozcqService;

    public WhulpqozcqController(WhulpqozcqService whulpqozcqService) {
        this.whulpqozcqService = whulpqozcqService;
    }

    @Get("/")
    public String index() {
        return whulpqozcqService.getGreeting();
    }
}
