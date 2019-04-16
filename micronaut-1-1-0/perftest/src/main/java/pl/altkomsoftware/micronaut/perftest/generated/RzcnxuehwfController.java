package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rzcnxuehwf")
public class RzcnxuehwfController {

    private final RzcnxuehwfService rzcnxuehwfService;

    public RzcnxuehwfController(RzcnxuehwfService rzcnxuehwfService) {
        this.rzcnxuehwfService = rzcnxuehwfService;
    }

    @Get("/")
    public String index() {
        return rzcnxuehwfService.getGreeting();
    }
}
