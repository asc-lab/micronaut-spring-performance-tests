package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/twgbvikoba")
public class TwgbvikobaController {

    private final TwgbvikobaService twgbvikobaService;

    public TwgbvikobaController(TwgbvikobaService twgbvikobaService) {
        this.twgbvikobaService = twgbvikobaService;
    }

    @Get("/")
    public String index() {
        return twgbvikobaService.getGreeting();
    }
}
