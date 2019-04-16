package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mfkckafnyy")
public class MfkckafnyyController {

    private final MfkckafnyyService mfkckafnyyService;

    public MfkckafnyyController(MfkckafnyyService mfkckafnyyService) {
        this.mfkckafnyyService = mfkckafnyyService;
    }

    @Get("/")
    public String index() {
        return mfkckafnyyService.getGreeting();
    }
}
