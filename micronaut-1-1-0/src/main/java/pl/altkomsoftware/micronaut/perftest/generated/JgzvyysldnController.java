package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jgzvyysldn")
public class JgzvyysldnController {

    private final JgzvyysldnService jgzvyysldnService;

    public JgzvyysldnController(JgzvyysldnService jgzvyysldnService) {
        this.jgzvyysldnService = jgzvyysldnService;
    }

    @Get("/")
    public String index() {
        return jgzvyysldnService.getGreeting();
    }
}
