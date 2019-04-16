package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sblczgdigs")
public class SblczgdigsController {

    private final SblczgdigsService sblczgdigsService;

    public SblczgdigsController(SblczgdigsService sblczgdigsService) {
        this.sblczgdigsService = sblczgdigsService;
    }

    @Get("/")
    public String index() {
        return sblczgdigsService.getGreeting();
    }
}
