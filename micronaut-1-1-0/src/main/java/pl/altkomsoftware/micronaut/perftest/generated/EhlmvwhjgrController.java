package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ehlmvwhjgr")
public class EhlmvwhjgrController {

    private final EhlmvwhjgrService ehlmvwhjgrService;

    public EhlmvwhjgrController(EhlmvwhjgrService ehlmvwhjgrService) {
        this.ehlmvwhjgrService = ehlmvwhjgrService;
    }

    @Get("/")
    public String index() {
        return ehlmvwhjgrService.getGreeting();
    }
}
