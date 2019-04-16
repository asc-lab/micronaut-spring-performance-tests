package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nhxwzwrnwd")
public class NhxwzwrnwdController {

    private final NhxwzwrnwdService nhxwzwrnwdService;

    public NhxwzwrnwdController(NhxwzwrnwdService nhxwzwrnwdService) {
        this.nhxwzwrnwdService = nhxwzwrnwdService;
    }

    @Get("/")
    public String index() {
        return nhxwzwrnwdService.getGreeting();
    }
}
