package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lbgnmllohk")
public class LbgnmllohkController {

    private final LbgnmllohkService lbgnmllohkService;

    public LbgnmllohkController(LbgnmllohkService lbgnmllohkService) {
        this.lbgnmllohkService = lbgnmllohkService;
    }

    @Get("/")
    public String index() {
        return lbgnmllohkService.getGreeting();
    }
}
