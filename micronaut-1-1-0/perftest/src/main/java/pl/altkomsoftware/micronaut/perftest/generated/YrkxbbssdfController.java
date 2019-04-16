package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yrkxbbssdf")
public class YrkxbbssdfController {

    private final YrkxbbssdfService yrkxbbssdfService;

    public YrkxbbssdfController(YrkxbbssdfService yrkxbbssdfService) {
        this.yrkxbbssdfService = yrkxbbssdfService;
    }

    @Get("/")
    public String index() {
        return yrkxbbssdfService.getGreeting();
    }
}
