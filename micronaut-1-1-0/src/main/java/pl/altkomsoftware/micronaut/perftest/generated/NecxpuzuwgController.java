package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/necxpuzuwg")
public class NecxpuzuwgController {

    private final NecxpuzuwgService necxpuzuwgService;

    public NecxpuzuwgController(NecxpuzuwgService necxpuzuwgService) {
        this.necxpuzuwgService = necxpuzuwgService;
    }

    @Get("/")
    public String index() {
        return necxpuzuwgService.getGreeting();
    }
}
