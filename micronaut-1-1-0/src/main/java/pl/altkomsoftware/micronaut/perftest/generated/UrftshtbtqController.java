package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/urftshtbtq")
public class UrftshtbtqController {

    private final UrftshtbtqService urftshtbtqService;

    public UrftshtbtqController(UrftshtbtqService urftshtbtqService) {
        this.urftshtbtqService = urftshtbtqService;
    }

    @Get("/")
    public String index() {
        return urftshtbtqService.getGreeting();
    }
}
