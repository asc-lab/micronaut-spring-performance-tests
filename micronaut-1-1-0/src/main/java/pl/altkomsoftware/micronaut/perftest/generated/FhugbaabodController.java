package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fhugbaabod")
public class FhugbaabodController {

    private final FhugbaabodService fhugbaabodService;

    public FhugbaabodController(FhugbaabodService fhugbaabodService) {
        this.fhugbaabodService = fhugbaabodService;
    }

    @Get("/")
    public String index() {
        return fhugbaabodService.getGreeting();
    }
}
