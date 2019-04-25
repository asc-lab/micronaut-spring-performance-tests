package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/diwulhdqyi")
public class DiwulhdqyiController {

    private final DiwulhdqyiService diwulhdqyiService;

    public DiwulhdqyiController(DiwulhdqyiService diwulhdqyiService) {
        this.diwulhdqyiService = diwulhdqyiService;
    }

    @Get("/")
    public String index() {
        return diwulhdqyiService.getGreeting();
    }
}
