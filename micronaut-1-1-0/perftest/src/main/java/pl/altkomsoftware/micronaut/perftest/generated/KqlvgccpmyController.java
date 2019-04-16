package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kqlvgccpmy")
public class KqlvgccpmyController {

    private final KqlvgccpmyService kqlvgccpmyService;

    public KqlvgccpmyController(KqlvgccpmyService kqlvgccpmyService) {
        this.kqlvgccpmyService = kqlvgccpmyService;
    }

    @Get("/")
    public String index() {
        return kqlvgccpmyService.getGreeting();
    }
}
