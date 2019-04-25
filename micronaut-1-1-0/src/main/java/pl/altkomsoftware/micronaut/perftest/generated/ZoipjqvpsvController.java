package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zoipjqvpsv")
public class ZoipjqvpsvController {

    private final ZoipjqvpsvService zoipjqvpsvService;

    public ZoipjqvpsvController(ZoipjqvpsvService zoipjqvpsvService) {
        this.zoipjqvpsvService = zoipjqvpsvService;
    }

    @Get("/")
    public String index() {
        return zoipjqvpsvService.getGreeting();
    }
}
