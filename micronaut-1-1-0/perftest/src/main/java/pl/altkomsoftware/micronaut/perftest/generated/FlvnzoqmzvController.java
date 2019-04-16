package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/flvnzoqmzv")
public class FlvnzoqmzvController {

    private final FlvnzoqmzvService flvnzoqmzvService;

    public FlvnzoqmzvController(FlvnzoqmzvService flvnzoqmzvService) {
        this.flvnzoqmzvService = flvnzoqmzvService;
    }

    @Get("/")
    public String index() {
        return flvnzoqmzvService.getGreeting();
    }
}
