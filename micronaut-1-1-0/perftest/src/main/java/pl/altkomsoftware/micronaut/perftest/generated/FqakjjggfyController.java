package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fqakjjggfy")
public class FqakjjggfyController {

    private final FqakjjggfyService fqakjjggfyService;

    public FqakjjggfyController(FqakjjggfyService fqakjjggfyService) {
        this.fqakjjggfyService = fqakjjggfyService;
    }

    @Get("/")
    public String index() {
        return fqakjjggfyService.getGreeting();
    }
}
