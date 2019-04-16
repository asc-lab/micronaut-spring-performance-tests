package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cebcmcrfkl")
public class CebcmcrfklController {

    private final CebcmcrfklService cebcmcrfklService;

    public CebcmcrfklController(CebcmcrfklService cebcmcrfklService) {
        this.cebcmcrfklService = cebcmcrfklService;
    }

    @Get("/")
    public String index() {
        return cebcmcrfklService.getGreeting();
    }
}
