package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/llxkaqpbuz")
public class LlxkaqpbuzController {

    private final LlxkaqpbuzService llxkaqpbuzService;

    public LlxkaqpbuzController(LlxkaqpbuzService llxkaqpbuzService) {
        this.llxkaqpbuzService = llxkaqpbuzService;
    }

    @Get("/")
    public String index() {
        return llxkaqpbuzService.getGreeting();
    }
}
