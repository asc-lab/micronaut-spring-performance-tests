package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jllbhabvjm")
public class JllbhabvjmController {

    private final JllbhabvjmService jllbhabvjmService;

    public JllbhabvjmController(JllbhabvjmService jllbhabvjmService) {
        this.jllbhabvjmService = jllbhabvjmService;
    }

    @Get("/")
    public String index() {
        return jllbhabvjmService.getGreeting();
    }
}
