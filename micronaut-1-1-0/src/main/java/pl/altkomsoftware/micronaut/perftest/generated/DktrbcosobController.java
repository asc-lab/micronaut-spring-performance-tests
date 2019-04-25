package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dktrbcosob")
public class DktrbcosobController {

    private final DktrbcosobService dktrbcosobService;

    public DktrbcosobController(DktrbcosobService dktrbcosobService) {
        this.dktrbcosobService = dktrbcosobService;
    }

    @Get("/")
    public String index() {
        return dktrbcosobService.getGreeting();
    }
}
