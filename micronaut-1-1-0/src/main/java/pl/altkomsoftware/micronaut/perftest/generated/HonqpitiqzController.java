package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/honqpitiqz")
public class HonqpitiqzController {

    private final HonqpitiqzService honqpitiqzService;

    public HonqpitiqzController(HonqpitiqzService honqpitiqzService) {
        this.honqpitiqzService = honqpitiqzService;
    }

    @Get("/")
    public String index() {
        return honqpitiqzService.getGreeting();
    }
}
