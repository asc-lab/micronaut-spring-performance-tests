package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dpdavrjkef")
public class DpdavrjkefController {

    private final DpdavrjkefService dpdavrjkefService;

    public DpdavrjkefController(DpdavrjkefService dpdavrjkefService) {
        this.dpdavrjkefService = dpdavrjkefService;
    }

    @Get("/")
    public String index() {
        return dpdavrjkefService.getGreeting();
    }
}
