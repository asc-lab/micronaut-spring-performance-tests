package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gmsezepcde")
public class GmsezepcdeController {

    private final GmsezepcdeService gmsezepcdeService;

    public GmsezepcdeController(GmsezepcdeService gmsezepcdeService) {
        this.gmsezepcdeService = gmsezepcdeService;
    }

    @Get("/")
    public String index() {
        return gmsezepcdeService.getGreeting();
    }
}
