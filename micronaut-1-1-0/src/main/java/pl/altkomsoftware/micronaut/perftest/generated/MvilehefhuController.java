package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mvilehefhu")
public class MvilehefhuController {

    private final MvilehefhuService mvilehefhuService;

    public MvilehefhuController(MvilehefhuService mvilehefhuService) {
        this.mvilehefhuService = mvilehefhuService;
    }

    @Get("/")
    public String index() {
        return mvilehefhuService.getGreeting();
    }
}
