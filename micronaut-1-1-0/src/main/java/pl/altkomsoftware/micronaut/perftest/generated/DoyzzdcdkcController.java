package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/doyzzdcdkc")
public class DoyzzdcdkcController {

    private final DoyzzdcdkcService doyzzdcdkcService;

    public DoyzzdcdkcController(DoyzzdcdkcService doyzzdcdkcService) {
        this.doyzzdcdkcService = doyzzdcdkcService;
    }

    @Get("/")
    public String index() {
        return doyzzdcdkcService.getGreeting();
    }
}
