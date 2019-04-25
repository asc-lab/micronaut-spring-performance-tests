package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/duchslcksg")
public class DuchslcksgController {

    private final DuchslcksgService duchslcksgService;

    public DuchslcksgController(DuchslcksgService duchslcksgService) {
        this.duchslcksgService = duchslcksgService;
    }

    @Get("/")
    public String index() {
        return duchslcksgService.getGreeting();
    }
}
