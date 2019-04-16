package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tckltgqwfm")
public class TckltgqwfmController {

    private final TckltgqwfmService tckltgqwfmService;

    public TckltgqwfmController(TckltgqwfmService tckltgqwfmService) {
        this.tckltgqwfmService = tckltgqwfmService;
    }

    @Get("/")
    public String index() {
        return tckltgqwfmService.getGreeting();
    }
}
