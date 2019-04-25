package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nahpvwjapr")
public class NahpvwjaprController {

    private final NahpvwjaprService nahpvwjaprService;

    public NahpvwjaprController(NahpvwjaprService nahpvwjaprService) {
        this.nahpvwjaprService = nahpvwjaprService;
    }

    @Get("/")
    public String index() {
        return nahpvwjaprService.getGreeting();
    }
}
