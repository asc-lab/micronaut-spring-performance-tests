package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/coniyoenbz")
public class ConiyoenbzController {

    private final ConiyoenbzService coniyoenbzService;

    public ConiyoenbzController(ConiyoenbzService coniyoenbzService) {
        this.coniyoenbzService = coniyoenbzService;
    }

    @Get("/")
    public String index() {
        return coniyoenbzService.getGreeting();
    }
}
