package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vjthslorvb")
public class VjthslorvbController {

    private final VjthslorvbService vjthslorvbService;

    public VjthslorvbController(VjthslorvbService vjthslorvbService) {
        this.vjthslorvbService = vjthslorvbService;
    }

    @Get("/")
    public String index() {
        return vjthslorvbService.getGreeting();
    }
}
