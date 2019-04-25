package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jcnmjxjqzb")
public class JcnmjxjqzbController {

    private final JcnmjxjqzbService jcnmjxjqzbService;

    public JcnmjxjqzbController(JcnmjxjqzbService jcnmjxjqzbService) {
        this.jcnmjxjqzbService = jcnmjxjqzbService;
    }

    @Get("/")
    public String index() {
        return jcnmjxjqzbService.getGreeting();
    }
}
