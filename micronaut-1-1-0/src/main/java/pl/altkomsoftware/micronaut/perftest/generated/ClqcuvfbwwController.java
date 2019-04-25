package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/clqcuvfbww")
public class ClqcuvfbwwController {

    private final ClqcuvfbwwService clqcuvfbwwService;

    public ClqcuvfbwwController(ClqcuvfbwwService clqcuvfbwwService) {
        this.clqcuvfbwwService = clqcuvfbwwService;
    }

    @Get("/")
    public String index() {
        return clqcuvfbwwService.getGreeting();
    }
}
