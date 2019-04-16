package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/elizmbbjss")
public class ElizmbbjssController {

    private final ElizmbbjssService elizmbbjssService;

    public ElizmbbjssController(ElizmbbjssService elizmbbjssService) {
        this.elizmbbjssService = elizmbbjssService;
    }

    @Get("/")
    public String index() {
        return elizmbbjssService.getGreeting();
    }
}
