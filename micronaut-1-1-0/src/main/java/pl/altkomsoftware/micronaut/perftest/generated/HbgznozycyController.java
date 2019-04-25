package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hbgznozycy")
public class HbgznozycyController {

    private final HbgznozycyService hbgznozycyService;

    public HbgznozycyController(HbgznozycyService hbgznozycyService) {
        this.hbgznozycyService = hbgznozycyService;
    }

    @Get("/")
    public String index() {
        return hbgznozycyService.getGreeting();
    }
}
