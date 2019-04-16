package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/notlmxknte")
public class NotlmxknteController {

    private final NotlmxknteService notlmxknteService;

    public NotlmxknteController(NotlmxknteService notlmxknteService) {
        this.notlmxknteService = notlmxknteService;
    }

    @Get("/")
    public String index() {
        return notlmxknteService.getGreeting();
    }
}
