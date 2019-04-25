package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ifzgvfrvnr")
public class IfzgvfrvnrController {

    private final IfzgvfrvnrService ifzgvfrvnrService;

    public IfzgvfrvnrController(IfzgvfrvnrService ifzgvfrvnrService) {
        this.ifzgvfrvnrService = ifzgvfrvnrService;
    }

    @Get("/")
    public String index() {
        return ifzgvfrvnrService.getGreeting();
    }
}
