package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/niacbaamka")
public class NiacbaamkaController {

    private final NiacbaamkaService niacbaamkaService;

    public NiacbaamkaController(NiacbaamkaService niacbaamkaService) {
        this.niacbaamkaService = niacbaamkaService;
    }

    @Get("/")
    public String index() {
        return niacbaamkaService.getGreeting();
    }
}
