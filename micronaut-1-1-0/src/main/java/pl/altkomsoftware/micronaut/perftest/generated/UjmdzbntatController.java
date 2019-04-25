package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ujmdzbntat")
public class UjmdzbntatController {

    private final UjmdzbntatService ujmdzbntatService;

    public UjmdzbntatController(UjmdzbntatService ujmdzbntatService) {
        this.ujmdzbntatService = ujmdzbntatService;
    }

    @Get("/")
    public String index() {
        return ujmdzbntatService.getGreeting();
    }
}
