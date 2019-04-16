package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/esgnezmctw")
public class EsgnezmctwController {

    private final EsgnezmctwService esgnezmctwService;

    public EsgnezmctwController(EsgnezmctwService esgnezmctwService) {
        this.esgnezmctwService = esgnezmctwService;
    }

    @Get("/")
    public String index() {
        return esgnezmctwService.getGreeting();
    }
}
