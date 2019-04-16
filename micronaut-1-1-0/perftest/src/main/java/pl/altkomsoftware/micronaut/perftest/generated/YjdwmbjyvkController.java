package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yjdwmbjyvk")
public class YjdwmbjyvkController {

    private final YjdwmbjyvkService yjdwmbjyvkService;

    public YjdwmbjyvkController(YjdwmbjyvkService yjdwmbjyvkService) {
        this.yjdwmbjyvkService = yjdwmbjyvkService;
    }

    @Get("/")
    public String index() {
        return yjdwmbjyvkService.getGreeting();
    }
}
