package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/busopawkss")
public class BusopawkssController {

    private final BusopawkssService busopawkssService;

    public BusopawkssController(BusopawkssService busopawkssService) {
        this.busopawkssService = busopawkssService;
    }

    @Get("/")
    public String index() {
        return busopawkssService.getGreeting();
    }
}
