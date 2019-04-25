package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/atpecauvxs")
public class AtpecauvxsController {

    private final AtpecauvxsService atpecauvxsService;

    public AtpecauvxsController(AtpecauvxsService atpecauvxsService) {
        this.atpecauvxsService = atpecauvxsService;
    }

    @Get("/")
    public String index() {
        return atpecauvxsService.getGreeting();
    }
}
