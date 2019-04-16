package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fctabhknwg")
public class FctabhknwgController {

    private final FctabhknwgService fctabhknwgService;

    public FctabhknwgController(FctabhknwgService fctabhknwgService) {
        this.fctabhknwgService = fctabhknwgService;
    }

    @Get("/")
    public String index() {
        return fctabhknwgService.getGreeting();
    }
}
