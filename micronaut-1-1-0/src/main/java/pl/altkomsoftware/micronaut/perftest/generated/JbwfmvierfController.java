package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jbwfmvierf")
public class JbwfmvierfController {

    private final JbwfmvierfService jbwfmvierfService;

    public JbwfmvierfController(JbwfmvierfService jbwfmvierfService) {
        this.jbwfmvierfService = jbwfmvierfService;
    }

    @Get("/")
    public String index() {
        return jbwfmvierfService.getGreeting();
    }
}
