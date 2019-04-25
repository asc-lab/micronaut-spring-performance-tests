package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dzfwoqpuxl")
public class DzfwoqpuxlController {

    private final DzfwoqpuxlService dzfwoqpuxlService;

    public DzfwoqpuxlController(DzfwoqpuxlService dzfwoqpuxlService) {
        this.dzfwoqpuxlService = dzfwoqpuxlService;
    }

    @Get("/")
    public String index() {
        return dzfwoqpuxlService.getGreeting();
    }
}
