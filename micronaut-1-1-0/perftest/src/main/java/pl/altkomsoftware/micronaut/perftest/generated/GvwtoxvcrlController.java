package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gvwtoxvcrl")
public class GvwtoxvcrlController {

    private final GvwtoxvcrlService gvwtoxvcrlService;

    public GvwtoxvcrlController(GvwtoxvcrlService gvwtoxvcrlService) {
        this.gvwtoxvcrlService = gvwtoxvcrlService;
    }

    @Get("/")
    public String index() {
        return gvwtoxvcrlService.getGreeting();
    }
}
