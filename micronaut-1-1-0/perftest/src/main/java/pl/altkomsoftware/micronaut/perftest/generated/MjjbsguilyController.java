package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mjjbsguily")
public class MjjbsguilyController {

    private final MjjbsguilyService mjjbsguilyService;

    public MjjbsguilyController(MjjbsguilyService mjjbsguilyService) {
        this.mjjbsguilyService = mjjbsguilyService;
    }

    @Get("/")
    public String index() {
        return mjjbsguilyService.getGreeting();
    }
}
