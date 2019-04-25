package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dwacwjslek")
public class DwacwjslekController {

    private final DwacwjslekService dwacwjslekService;

    public DwacwjslekController(DwacwjslekService dwacwjslekService) {
        this.dwacwjslekService = dwacwjslekService;
    }

    @Get("/")
    public String index() {
        return dwacwjslekService.getGreeting();
    }
}
