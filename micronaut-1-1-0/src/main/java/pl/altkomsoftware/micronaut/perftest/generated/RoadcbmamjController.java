package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/roadcbmamj")
public class RoadcbmamjController {

    private final RoadcbmamjService roadcbmamjService;

    public RoadcbmamjController(RoadcbmamjService roadcbmamjService) {
        this.roadcbmamjService = roadcbmamjService;
    }

    @Get("/")
    public String index() {
        return roadcbmamjService.getGreeting();
    }
}
