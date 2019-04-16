package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hnecuccfvh")
public class HnecuccfvhController {

    private final HnecuccfvhService hnecuccfvhService;

    public HnecuccfvhController(HnecuccfvhService hnecuccfvhService) {
        this.hnecuccfvhService = hnecuccfvhService;
    }

    @Get("/")
    public String index() {
        return hnecuccfvhService.getGreeting();
    }
}
