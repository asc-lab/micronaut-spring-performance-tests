package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lvumzamhyd")
public class LvumzamhydController {

    private final LvumzamhydService lvumzamhydService;

    public LvumzamhydController(LvumzamhydService lvumzamhydService) {
        this.lvumzamhydService = lvumzamhydService;
    }

    @Get("/")
    public String index() {
        return lvumzamhydService.getGreeting();
    }
}
