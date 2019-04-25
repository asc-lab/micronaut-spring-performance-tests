package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tsviuceawj")
public class TsviuceawjController {

    private final TsviuceawjService tsviuceawjService;

    public TsviuceawjController(TsviuceawjService tsviuceawjService) {
        this.tsviuceawjService = tsviuceawjService;
    }

    @Get("/")
    public String index() {
        return tsviuceawjService.getGreeting();
    }
}
