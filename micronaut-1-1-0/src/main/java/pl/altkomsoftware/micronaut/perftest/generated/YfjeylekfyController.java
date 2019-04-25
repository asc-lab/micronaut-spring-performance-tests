package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yfjeylekfy")
public class YfjeylekfyController {

    private final YfjeylekfyService yfjeylekfyService;

    public YfjeylekfyController(YfjeylekfyService yfjeylekfyService) {
        this.yfjeylekfyService = yfjeylekfyService;
    }

    @Get("/")
    public String index() {
        return yfjeylekfyService.getGreeting();
    }
}
