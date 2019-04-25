package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mqdpkfdlsw")
public class MqdpkfdlswController {

    private final MqdpkfdlswService mqdpkfdlswService;

    public MqdpkfdlswController(MqdpkfdlswService mqdpkfdlswService) {
        this.mqdpkfdlswService = mqdpkfdlswService;
    }

    @Get("/")
    public String index() {
        return mqdpkfdlswService.getGreeting();
    }
}
