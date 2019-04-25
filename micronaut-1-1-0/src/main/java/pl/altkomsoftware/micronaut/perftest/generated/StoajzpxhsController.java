package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/stoajzpxhs")
public class StoajzpxhsController {

    private final StoajzpxhsService stoajzpxhsService;

    public StoajzpxhsController(StoajzpxhsService stoajzpxhsService) {
        this.stoajzpxhsService = stoajzpxhsService;
    }

    @Get("/")
    public String index() {
        return stoajzpxhsService.getGreeting();
    }
}
