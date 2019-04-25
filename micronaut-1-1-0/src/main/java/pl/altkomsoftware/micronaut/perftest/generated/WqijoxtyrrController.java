package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wqijoxtyrr")
public class WqijoxtyrrController {

    private final WqijoxtyrrService wqijoxtyrrService;

    public WqijoxtyrrController(WqijoxtyrrService wqijoxtyrrService) {
        this.wqijoxtyrrService = wqijoxtyrrService;
    }

    @Get("/")
    public String index() {
        return wqijoxtyrrService.getGreeting();
    }
}
