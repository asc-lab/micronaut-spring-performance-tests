package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cgfyzbkbvg")
public class CgfyzbkbvgController {

    private final CgfyzbkbvgService cgfyzbkbvgService;

    public CgfyzbkbvgController(CgfyzbkbvgService cgfyzbkbvgService) {
        this.cgfyzbkbvgService = cgfyzbkbvgService;
    }

    @Get("/")
    public String index() {
        return cgfyzbkbvgService.getGreeting();
    }
}
