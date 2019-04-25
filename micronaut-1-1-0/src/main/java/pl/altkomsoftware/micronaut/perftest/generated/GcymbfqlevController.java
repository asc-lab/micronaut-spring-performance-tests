package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gcymbfqlev")
public class GcymbfqlevController {

    private final GcymbfqlevService gcymbfqlevService;

    public GcymbfqlevController(GcymbfqlevService gcymbfqlevService) {
        this.gcymbfqlevService = gcymbfqlevService;
    }

    @Get("/")
    public String index() {
        return gcymbfqlevService.getGreeting();
    }
}
