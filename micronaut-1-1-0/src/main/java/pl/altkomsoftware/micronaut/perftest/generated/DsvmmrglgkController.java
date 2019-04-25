package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dsvmmrglgk")
public class DsvmmrglgkController {

    private final DsvmmrglgkService dsvmmrglgkService;

    public DsvmmrglgkController(DsvmmrglgkService dsvmmrglgkService) {
        this.dsvmmrglgkService = dsvmmrglgkService;
    }

    @Get("/")
    public String index() {
        return dsvmmrglgkService.getGreeting();
    }
}
