package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/inbfnqkant")
public class InbfnqkantController {

    private final InbfnqkantService inbfnqkantService;

    public InbfnqkantController(InbfnqkantService inbfnqkantService) {
        this.inbfnqkantService = inbfnqkantService;
    }

    @Get("/")
    public String index() {
        return inbfnqkantService.getGreeting();
    }
}
