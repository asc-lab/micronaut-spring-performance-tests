package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hovyzdioex")
public class HovyzdioexController {

    private final HovyzdioexService hovyzdioexService;

    public HovyzdioexController(HovyzdioexService hovyzdioexService) {
        this.hovyzdioexService = hovyzdioexService;
    }

    @Get("/")
    public String index() {
        return hovyzdioexService.getGreeting();
    }
}
