package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/laqevavdwv")
public class LaqevavdwvController {

    private final LaqevavdwvService laqevavdwvService;

    public LaqevavdwvController(LaqevavdwvService laqevavdwvService) {
        this.laqevavdwvService = laqevavdwvService;
    }

    @Get("/")
    public String index() {
        return laqevavdwvService.getGreeting();
    }
}
