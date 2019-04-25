package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/blitjlrjuw")
public class BlitjlrjuwController {

    private final BlitjlrjuwService blitjlrjuwService;

    public BlitjlrjuwController(BlitjlrjuwService blitjlrjuwService) {
        this.blitjlrjuwService = blitjlrjuwService;
    }

    @Get("/")
    public String index() {
        return blitjlrjuwService.getGreeting();
    }
}
