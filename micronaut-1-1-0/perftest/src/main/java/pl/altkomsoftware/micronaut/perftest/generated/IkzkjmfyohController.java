package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ikzkjmfyoh")
public class IkzkjmfyohController {

    private final IkzkjmfyohService ikzkjmfyohService;

    public IkzkjmfyohController(IkzkjmfyohService ikzkjmfyohService) {
        this.ikzkjmfyohService = ikzkjmfyohService;
    }

    @Get("/")
    public String index() {
        return ikzkjmfyohService.getGreeting();
    }
}
