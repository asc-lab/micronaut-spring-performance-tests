package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gvqcmyrpki")
public class GvqcmyrpkiController {

    private final GvqcmyrpkiService gvqcmyrpkiService;

    public GvqcmyrpkiController(GvqcmyrpkiService gvqcmyrpkiService) {
        this.gvqcmyrpkiService = gvqcmyrpkiService;
    }

    @Get("/")
    public String index() {
        return gvqcmyrpkiService.getGreeting();
    }
}
