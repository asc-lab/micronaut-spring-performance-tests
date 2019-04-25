package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ujredubvyk")
public class UjredubvykController {

    private final UjredubvykService ujredubvykService;

    public UjredubvykController(UjredubvykService ujredubvykService) {
        this.ujredubvykService = ujredubvykService;
    }

    @Get("/")
    public String index() {
        return ujredubvykService.getGreeting();
    }
}
