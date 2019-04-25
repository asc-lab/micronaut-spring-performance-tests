package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gxdqzsbvot")
public class GxdqzsbvotController {

    private final GxdqzsbvotService gxdqzsbvotService;

    public GxdqzsbvotController(GxdqzsbvotService gxdqzsbvotService) {
        this.gxdqzsbvotService = gxdqzsbvotService;
    }

    @Get("/")
    public String index() {
        return gxdqzsbvotService.getGreeting();
    }
}
