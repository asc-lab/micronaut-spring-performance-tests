package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sqpdbosbzc")
public class SqpdbosbzcController {

    private final SqpdbosbzcService sqpdbosbzcService;

    public SqpdbosbzcController(SqpdbosbzcService sqpdbosbzcService) {
        this.sqpdbosbzcService = sqpdbosbzcService;
    }

    @Get("/")
    public String index() {
        return sqpdbosbzcService.getGreeting();
    }
}
