package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sqmfrmbntf")
public class SqmfrmbntfController {

    private final SqmfrmbntfService sqmfrmbntfService;

    public SqmfrmbntfController(SqmfrmbntfService sqmfrmbntfService) {
        this.sqmfrmbntfService = sqmfrmbntfService;
    }

    @Get("/")
    public String index() {
        return sqmfrmbntfService.getGreeting();
    }
}
