package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gyqepcrczm")
public class GyqepcrczmController {

    private final GyqepcrczmService gyqepcrczmService;

    public GyqepcrczmController(GyqepcrczmService gyqepcrczmService) {
        this.gyqepcrczmService = gyqepcrczmService;
    }

    @Get("/")
    public String index() {
        return gyqepcrczmService.getGreeting();
    }
}
