package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dvkzjbeefr")
public class DvkzjbeefrController {

    private final DvkzjbeefrService dvkzjbeefrService;

    public DvkzjbeefrController(DvkzjbeefrService dvkzjbeefrService) {
        this.dvkzjbeefrService = dvkzjbeefrService;
    }

    @Get("/")
    public String index() {
        return dvkzjbeefrService.getGreeting();
    }
}
