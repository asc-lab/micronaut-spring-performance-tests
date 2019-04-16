package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pkmuvgcwbd")
public class PkmuvgcwbdController {

    private final PkmuvgcwbdService pkmuvgcwbdService;

    public PkmuvgcwbdController(PkmuvgcwbdService pkmuvgcwbdService) {
        this.pkmuvgcwbdService = pkmuvgcwbdService;
    }

    @Get("/")
    public String index() {
        return pkmuvgcwbdService.getGreeting();
    }
}
