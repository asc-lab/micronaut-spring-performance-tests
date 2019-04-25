package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sqgdcrgndj")
public class SqgdcrgndjController {

    private final SqgdcrgndjService sqgdcrgndjService;

    public SqgdcrgndjController(SqgdcrgndjService sqgdcrgndjService) {
        this.sqgdcrgndjService = sqgdcrgndjService;
    }

    @Get("/")
    public String index() {
        return sqgdcrgndjService.getGreeting();
    }
}
