package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wwfxgcolqj")
public class WwfxgcolqjController {

    private final WwfxgcolqjService wwfxgcolqjService;

    public WwfxgcolqjController(WwfxgcolqjService wwfxgcolqjService) {
        this.wwfxgcolqjService = wwfxgcolqjService;
    }

    @Get("/")
    public String index() {
        return wwfxgcolqjService.getGreeting();
    }
}
