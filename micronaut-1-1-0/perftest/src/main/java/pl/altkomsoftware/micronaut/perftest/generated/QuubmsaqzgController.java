package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/quubmsaqzg")
public class QuubmsaqzgController {

    private final QuubmsaqzgService quubmsaqzgService;

    public QuubmsaqzgController(QuubmsaqzgService quubmsaqzgService) {
        this.quubmsaqzgService = quubmsaqzgService;
    }

    @Get("/")
    public String index() {
        return quubmsaqzgService.getGreeting();
    }
}
