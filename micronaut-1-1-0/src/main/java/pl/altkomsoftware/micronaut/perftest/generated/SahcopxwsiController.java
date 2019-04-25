package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sahcopxwsi")
public class SahcopxwsiController {

    private final SahcopxwsiService sahcopxwsiService;

    public SahcopxwsiController(SahcopxwsiService sahcopxwsiService) {
        this.sahcopxwsiService = sahcopxwsiService;
    }

    @Get("/")
    public String index() {
        return sahcopxwsiService.getGreeting();
    }
}
