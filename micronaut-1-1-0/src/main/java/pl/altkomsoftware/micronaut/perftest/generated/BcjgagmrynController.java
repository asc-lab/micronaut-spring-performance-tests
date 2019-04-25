package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bcjgagmryn")
public class BcjgagmrynController {

    private final BcjgagmrynService bcjgagmrynService;

    public BcjgagmrynController(BcjgagmrynService bcjgagmrynService) {
        this.bcjgagmrynService = bcjgagmrynService;
    }

    @Get("/")
    public String index() {
        return bcjgagmrynService.getGreeting();
    }
}
