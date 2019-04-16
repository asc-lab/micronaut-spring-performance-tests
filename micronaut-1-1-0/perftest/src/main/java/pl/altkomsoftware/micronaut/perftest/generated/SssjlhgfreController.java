package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sssjlhgfre")
public class SssjlhgfreController {

    private final SssjlhgfreService sssjlhgfreService;

    public SssjlhgfreController(SssjlhgfreService sssjlhgfreService) {
        this.sssjlhgfreService = sssjlhgfreService;
    }

    @Get("/")
    public String index() {
        return sssjlhgfreService.getGreeting();
    }
}
