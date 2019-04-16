package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/owuthufkwq")
public class OwuthufkwqController {

    private final OwuthufkwqService owuthufkwqService;

    public OwuthufkwqController(OwuthufkwqService owuthufkwqService) {
        this.owuthufkwqService = owuthufkwqService;
    }

    @Get("/")
    public String index() {
        return owuthufkwqService.getGreeting();
    }
}
