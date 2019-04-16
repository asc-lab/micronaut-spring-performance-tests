package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gflcxaihuq")
public class GflcxaihuqController {

    private final GflcxaihuqService gflcxaihuqService;

    public GflcxaihuqController(GflcxaihuqService gflcxaihuqService) {
        this.gflcxaihuqService = gflcxaihuqService;
    }

    @Get("/")
    public String index() {
        return gflcxaihuqService.getGreeting();
    }
}
