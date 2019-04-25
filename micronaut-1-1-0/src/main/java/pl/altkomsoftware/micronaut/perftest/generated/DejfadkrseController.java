package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dejfadkrse")
public class DejfadkrseController {

    private final DejfadkrseService dejfadkrseService;

    public DejfadkrseController(DejfadkrseService dejfadkrseService) {
        this.dejfadkrseService = dejfadkrseService;
    }

    @Get("/")
    public String index() {
        return dejfadkrseService.getGreeting();
    }
}
