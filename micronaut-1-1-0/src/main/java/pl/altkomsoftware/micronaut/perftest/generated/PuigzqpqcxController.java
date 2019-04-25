package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/puigzqpqcx")
public class PuigzqpqcxController {

    private final PuigzqpqcxService puigzqpqcxService;

    public PuigzqpqcxController(PuigzqpqcxService puigzqpqcxService) {
        this.puigzqpqcxService = puigzqpqcxService;
    }

    @Get("/")
    public String index() {
        return puigzqpqcxService.getGreeting();
    }
}
