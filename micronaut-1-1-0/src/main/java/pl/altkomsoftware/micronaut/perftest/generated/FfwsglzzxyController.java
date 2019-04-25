package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ffwsglzzxy")
public class FfwsglzzxyController {

    private final FfwsglzzxyService ffwsglzzxyService;

    public FfwsglzzxyController(FfwsglzzxyService ffwsglzzxyService) {
        this.ffwsglzzxyService = ffwsglzzxyService;
    }

    @Get("/")
    public String index() {
        return ffwsglzzxyService.getGreeting();
    }
}
