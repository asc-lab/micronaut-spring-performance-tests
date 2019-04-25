package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aceeuuoxos")
public class AceeuuoxosController {

    private final AceeuuoxosService aceeuuoxosService;

    public AceeuuoxosController(AceeuuoxosService aceeuuoxosService) {
        this.aceeuuoxosService = aceeuuoxosService;
    }

    @Get("/")
    public String index() {
        return aceeuuoxosService.getGreeting();
    }
}
