package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jnbvvejjww")
public class JnbvvejjwwController {

    private final JnbvvejjwwService jnbvvejjwwService;

    public JnbvvejjwwController(JnbvvejjwwService jnbvvejjwwService) {
        this.jnbvvejjwwService = jnbvvejjwwService;
    }

    @Get("/")
    public String index() {
        return jnbvvejjwwService.getGreeting();
    }
}
