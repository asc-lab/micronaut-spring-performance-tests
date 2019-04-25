package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dpmfyeqswn")
public class DpmfyeqswnController {

    private final DpmfyeqswnService dpmfyeqswnService;

    public DpmfyeqswnController(DpmfyeqswnService dpmfyeqswnService) {
        this.dpmfyeqswnService = dpmfyeqswnService;
    }

    @Get("/")
    public String index() {
        return dpmfyeqswnService.getGreeting();
    }
}
