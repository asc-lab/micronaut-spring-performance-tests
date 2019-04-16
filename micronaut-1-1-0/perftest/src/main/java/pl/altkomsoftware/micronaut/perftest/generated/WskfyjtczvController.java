package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wskfyjtczv")
public class WskfyjtczvController {

    private final WskfyjtczvService wskfyjtczvService;

    public WskfyjtczvController(WskfyjtczvService wskfyjtczvService) {
        this.wskfyjtczvService = wskfyjtczvService;
    }

    @Get("/")
    public String index() {
        return wskfyjtczvService.getGreeting();
    }
}
