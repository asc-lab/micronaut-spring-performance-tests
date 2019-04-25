package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/swuqdpqeru")
public class SwuqdpqeruController {

    private final SwuqdpqeruService swuqdpqeruService;

    public SwuqdpqeruController(SwuqdpqeruService swuqdpqeruService) {
        this.swuqdpqeruService = swuqdpqeruService;
    }

    @Get("/")
    public String index() {
        return swuqdpqeruService.getGreeting();
    }
}
