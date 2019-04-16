package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wnxgrlnyum")
public class WnxgrlnyumController {

    private final WnxgrlnyumService wnxgrlnyumService;

    public WnxgrlnyumController(WnxgrlnyumService wnxgrlnyumService) {
        this.wnxgrlnyumService = wnxgrlnyumService;
    }

    @Get("/")
    public String index() {
        return wnxgrlnyumService.getGreeting();
    }
}
