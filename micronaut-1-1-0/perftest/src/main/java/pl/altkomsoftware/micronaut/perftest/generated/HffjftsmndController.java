package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hffjftsmnd")
public class HffjftsmndController {

    private final HffjftsmndService hffjftsmndService;

    public HffjftsmndController(HffjftsmndService hffjftsmndService) {
        this.hffjftsmndService = hffjftsmndService;
    }

    @Get("/")
    public String index() {
        return hffjftsmndService.getGreeting();
    }
}
