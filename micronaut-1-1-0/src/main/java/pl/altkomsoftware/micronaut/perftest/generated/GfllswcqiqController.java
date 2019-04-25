package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gfllswcqiq")
public class GfllswcqiqController {

    private final GfllswcqiqService gfllswcqiqService;

    public GfllswcqiqController(GfllswcqiqService gfllswcqiqService) {
        this.gfllswcqiqService = gfllswcqiqService;
    }

    @Get("/")
    public String index() {
        return gfllswcqiqService.getGreeting();
    }
}
