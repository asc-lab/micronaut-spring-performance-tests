package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/azhgfyisjf")
public class AzhgfyisjfController {

    private final AzhgfyisjfService azhgfyisjfService;

    public AzhgfyisjfController(AzhgfyisjfService azhgfyisjfService) {
        this.azhgfyisjfService = azhgfyisjfService;
    }

    @Get("/")
    public String index() {
        return azhgfyisjfService.getGreeting();
    }
}
