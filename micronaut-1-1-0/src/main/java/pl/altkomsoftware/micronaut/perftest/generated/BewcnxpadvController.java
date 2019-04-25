package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bewcnxpadv")
public class BewcnxpadvController {

    private final BewcnxpadvService bewcnxpadvService;

    public BewcnxpadvController(BewcnxpadvService bewcnxpadvService) {
        this.bewcnxpadvService = bewcnxpadvService;
    }

    @Get("/")
    public String index() {
        return bewcnxpadvService.getGreeting();
    }
}
