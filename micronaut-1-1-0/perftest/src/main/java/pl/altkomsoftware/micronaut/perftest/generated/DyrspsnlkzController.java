package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dyrspsnlkz")
public class DyrspsnlkzController {

    private final DyrspsnlkzService dyrspsnlkzService;

    public DyrspsnlkzController(DyrspsnlkzService dyrspsnlkzService) {
        this.dyrspsnlkzService = dyrspsnlkzService;
    }

    @Get("/")
    public String index() {
        return dyrspsnlkzService.getGreeting();
    }
}
