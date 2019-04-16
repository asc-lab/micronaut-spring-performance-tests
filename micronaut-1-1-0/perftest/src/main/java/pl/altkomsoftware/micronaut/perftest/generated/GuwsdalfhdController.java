package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/guwsdalfhd")
public class GuwsdalfhdController {

    private final GuwsdalfhdService guwsdalfhdService;

    public GuwsdalfhdController(GuwsdalfhdService guwsdalfhdService) {
        this.guwsdalfhdService = guwsdalfhdService;
    }

    @Get("/")
    public String index() {
        return guwsdalfhdService.getGreeting();
    }
}
