package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ujxcltsjvr")
public class UjxcltsjvrController {

    private final UjxcltsjvrService ujxcltsjvrService;

    public UjxcltsjvrController(UjxcltsjvrService ujxcltsjvrService) {
        this.ujxcltsjvrService = ujxcltsjvrService;
    }

    @Get("/")
    public String index() {
        return ujxcltsjvrService.getGreeting();
    }
}
