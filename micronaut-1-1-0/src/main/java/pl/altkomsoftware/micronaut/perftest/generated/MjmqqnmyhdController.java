package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mjmqqnmyhd")
public class MjmqqnmyhdController {

    private final MjmqqnmyhdService mjmqqnmyhdService;

    public MjmqqnmyhdController(MjmqqnmyhdService mjmqqnmyhdService) {
        this.mjmqqnmyhdService = mjmqqnmyhdService;
    }

    @Get("/")
    public String index() {
        return mjmqqnmyhdService.getGreeting();
    }
}
