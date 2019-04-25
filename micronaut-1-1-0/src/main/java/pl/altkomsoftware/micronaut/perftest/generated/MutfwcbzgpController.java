package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mutfwcbzgp")
public class MutfwcbzgpController {

    private final MutfwcbzgpService mutfwcbzgpService;

    public MutfwcbzgpController(MutfwcbzgpService mutfwcbzgpService) {
        this.mutfwcbzgpService = mutfwcbzgpService;
    }

    @Get("/")
    public String index() {
        return mutfwcbzgpService.getGreeting();
    }
}
