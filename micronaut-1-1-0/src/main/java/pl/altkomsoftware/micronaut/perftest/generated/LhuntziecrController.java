package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lhuntziecr")
public class LhuntziecrController {

    private final LhuntziecrService lhuntziecrService;

    public LhuntziecrController(LhuntziecrService lhuntziecrService) {
        this.lhuntziecrService = lhuntziecrService;
    }

    @Get("/")
    public String index() {
        return lhuntziecrService.getGreeting();
    }
}
