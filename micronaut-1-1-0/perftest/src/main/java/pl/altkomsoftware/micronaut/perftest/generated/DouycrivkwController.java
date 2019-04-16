package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/douycrivkw")
public class DouycrivkwController {

    private final DouycrivkwService douycrivkwService;

    public DouycrivkwController(DouycrivkwService douycrivkwService) {
        this.douycrivkwService = douycrivkwService;
    }

    @Get("/")
    public String index() {
        return douycrivkwService.getGreeting();
    }
}
