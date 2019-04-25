package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/forqgxsqfp")
public class ForqgxsqfpController {

    private final ForqgxsqfpService forqgxsqfpService;

    public ForqgxsqfpController(ForqgxsqfpService forqgxsqfpService) {
        this.forqgxsqfpService = forqgxsqfpService;
    }

    @Get("/")
    public String index() {
        return forqgxsqfpService.getGreeting();
    }
}
