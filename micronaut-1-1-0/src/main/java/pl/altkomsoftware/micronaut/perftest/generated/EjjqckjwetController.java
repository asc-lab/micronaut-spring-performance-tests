package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ejjqckjwet")
public class EjjqckjwetController {

    private final EjjqckjwetService ejjqckjwetService;

    public EjjqckjwetController(EjjqckjwetService ejjqckjwetService) {
        this.ejjqckjwetService = ejjqckjwetService;
    }

    @Get("/")
    public String index() {
        return ejjqckjwetService.getGreeting();
    }
}
