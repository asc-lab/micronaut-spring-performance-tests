package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rzpfvrgmcu")
public class RzpfvrgmcuController {

    private final RzpfvrgmcuService rzpfvrgmcuService;

    public RzpfvrgmcuController(RzpfvrgmcuService rzpfvrgmcuService) {
        this.rzpfvrgmcuService = rzpfvrgmcuService;
    }

    @Get("/")
    public String index() {
        return rzpfvrgmcuService.getGreeting();
    }
}
