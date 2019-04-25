package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mtrrscvqhx")
public class MtrrscvqhxController {

    private final MtrrscvqhxService mtrrscvqhxService;

    public MtrrscvqhxController(MtrrscvqhxService mtrrscvqhxService) {
        this.mtrrscvqhxService = mtrrscvqhxService;
    }

    @Get("/")
    public String index() {
        return mtrrscvqhxService.getGreeting();
    }
}
