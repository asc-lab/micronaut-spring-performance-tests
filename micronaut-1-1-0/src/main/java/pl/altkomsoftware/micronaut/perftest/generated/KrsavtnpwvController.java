package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/krsavtnpwv")
public class KrsavtnpwvController {

    private final KrsavtnpwvService krsavtnpwvService;

    public KrsavtnpwvController(KrsavtnpwvService krsavtnpwvService) {
        this.krsavtnpwvService = krsavtnpwvService;
    }

    @Get("/")
    public String index() {
        return krsavtnpwvService.getGreeting();
    }
}
