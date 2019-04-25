package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zgwubplyvk")
public class ZgwubplyvkController {

    private final ZgwubplyvkService zgwubplyvkService;

    public ZgwubplyvkController(ZgwubplyvkService zgwubplyvkService) {
        this.zgwubplyvkService = zgwubplyvkService;
    }

    @Get("/")
    public String index() {
        return zgwubplyvkService.getGreeting();
    }
}
