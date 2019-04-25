package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dindnpugcc")
public class DindnpugccController {

    private final DindnpugccService dindnpugccService;

    public DindnpugccController(DindnpugccService dindnpugccService) {
        this.dindnpugccService = dindnpugccService;
    }

    @Get("/")
    public String index() {
        return dindnpugccService.getGreeting();
    }
}
