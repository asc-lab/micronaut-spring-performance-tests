package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eytkosrutw")
public class EytkosrutwController {

    private final EytkosrutwService eytkosrutwService;

    public EytkosrutwController(EytkosrutwService eytkosrutwService) {
        this.eytkosrutwService = eytkosrutwService;
    }

    @Get("/")
    public String index() {
        return eytkosrutwService.getGreeting();
    }
}
