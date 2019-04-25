package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lodalhwppb")
public class LodalhwppbController {

    private final LodalhwppbService lodalhwppbService;

    public LodalhwppbController(LodalhwppbService lodalhwppbService) {
        this.lodalhwppbService = lodalhwppbService;
    }

    @Get("/")
    public String index() {
        return lodalhwppbService.getGreeting();
    }
}
