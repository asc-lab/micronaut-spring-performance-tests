package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/feswrszlkq")
public class FeswrszlkqController {

    private final FeswrszlkqService feswrszlkqService;

    public FeswrszlkqController(FeswrszlkqService feswrszlkqService) {
        this.feswrszlkqService = feswrszlkqService;
    }

    @Get("/")
    public String index() {
        return feswrszlkqService.getGreeting();
    }
}
