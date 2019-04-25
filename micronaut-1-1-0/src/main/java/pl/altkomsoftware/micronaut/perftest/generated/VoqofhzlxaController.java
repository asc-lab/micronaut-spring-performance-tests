package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/voqofhzlxa")
public class VoqofhzlxaController {

    private final VoqofhzlxaService voqofhzlxaService;

    public VoqofhzlxaController(VoqofhzlxaService voqofhzlxaService) {
        this.voqofhzlxaService = voqofhzlxaService;
    }

    @Get("/")
    public String index() {
        return voqofhzlxaService.getGreeting();
    }
}
