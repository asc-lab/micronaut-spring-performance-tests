package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/knlnwcgxvr")
public class KnlnwcgxvrController {

    private final KnlnwcgxvrService knlnwcgxvrService;

    public KnlnwcgxvrController(KnlnwcgxvrService knlnwcgxvrService) {
        this.knlnwcgxvrService = knlnwcgxvrService;
    }

    @Get("/")
    public String index() {
        return knlnwcgxvrService.getGreeting();
    }
}
