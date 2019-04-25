package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ysgtnmxjlh")
public class YsgtnmxjlhController {

    private final YsgtnmxjlhService ysgtnmxjlhService;

    public YsgtnmxjlhController(YsgtnmxjlhService ysgtnmxjlhService) {
        this.ysgtnmxjlhService = ysgtnmxjlhService;
    }

    @Get("/")
    public String index() {
        return ysgtnmxjlhService.getGreeting();
    }
}
