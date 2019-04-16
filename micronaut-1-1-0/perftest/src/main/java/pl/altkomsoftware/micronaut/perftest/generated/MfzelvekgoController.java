package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mfzelvekgo")
public class MfzelvekgoController {

    private final MfzelvekgoService mfzelvekgoService;

    public MfzelvekgoController(MfzelvekgoService mfzelvekgoService) {
        this.mfzelvekgoService = mfzelvekgoService;
    }

    @Get("/")
    public String index() {
        return mfzelvekgoService.getGreeting();
    }
}
