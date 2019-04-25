package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/klmyjhtduj")
public class KlmyjhtdujController {

    private final KlmyjhtdujService klmyjhtdujService;

    public KlmyjhtdujController(KlmyjhtdujService klmyjhtdujService) {
        this.klmyjhtdujService = klmyjhtdujService;
    }

    @Get("/")
    public String index() {
        return klmyjhtdujService.getGreeting();
    }
}
