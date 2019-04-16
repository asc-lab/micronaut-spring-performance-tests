package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jpvvqelfso")
public class JpvvqelfsoController {

    private final JpvvqelfsoService jpvvqelfsoService;

    public JpvvqelfsoController(JpvvqelfsoService jpvvqelfsoService) {
        this.jpvvqelfsoService = jpvvqelfsoService;
    }

    @Get("/")
    public String index() {
        return jpvvqelfsoService.getGreeting();
    }
}
