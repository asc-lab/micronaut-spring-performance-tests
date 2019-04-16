package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jlwzvetpqi")
public class JlwzvetpqiController {

    private final JlwzvetpqiService jlwzvetpqiService;

    public JlwzvetpqiController(JlwzvetpqiService jlwzvetpqiService) {
        this.jlwzvetpqiService = jlwzvetpqiService;
    }

    @Get("/")
    public String index() {
        return jlwzvetpqiService.getGreeting();
    }
}
