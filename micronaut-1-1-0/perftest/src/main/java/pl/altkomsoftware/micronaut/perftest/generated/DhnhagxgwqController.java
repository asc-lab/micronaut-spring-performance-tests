package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dhnhagxgwq")
public class DhnhagxgwqController {

    private final DhnhagxgwqService dhnhagxgwqService;

    public DhnhagxgwqController(DhnhagxgwqService dhnhagxgwqService) {
        this.dhnhagxgwqService = dhnhagxgwqService;
    }

    @Get("/")
    public String index() {
        return dhnhagxgwqService.getGreeting();
    }
}
