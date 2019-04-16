package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/djcveqrxum")
public class DjcveqrxumController {

    private final DjcveqrxumService djcveqrxumService;

    public DjcveqrxumController(DjcveqrxumService djcveqrxumService) {
        this.djcveqrxumService = djcveqrxumService;
    }

    @Get("/")
    public String index() {
        return djcveqrxumService.getGreeting();
    }
}
