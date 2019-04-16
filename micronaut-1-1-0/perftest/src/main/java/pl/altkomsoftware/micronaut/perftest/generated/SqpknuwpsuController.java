package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sqpknuwpsu")
public class SqpknuwpsuController {

    private final SqpknuwpsuService sqpknuwpsuService;

    public SqpknuwpsuController(SqpknuwpsuService sqpknuwpsuService) {
        this.sqpknuwpsuService = sqpknuwpsuService;
    }

    @Get("/")
    public String index() {
        return sqpknuwpsuService.getGreeting();
    }
}
