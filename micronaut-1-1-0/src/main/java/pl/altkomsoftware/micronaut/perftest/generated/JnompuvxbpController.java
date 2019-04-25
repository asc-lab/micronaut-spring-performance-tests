package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jnompuvxbp")
public class JnompuvxbpController {

    private final JnompuvxbpService jnompuvxbpService;

    public JnompuvxbpController(JnompuvxbpService jnompuvxbpService) {
        this.jnompuvxbpService = jnompuvxbpService;
    }

    @Get("/")
    public String index() {
        return jnompuvxbpService.getGreeting();
    }
}
