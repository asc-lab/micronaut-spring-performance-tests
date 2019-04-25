package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aiiaggxdty")
public class AiiaggxdtyController {

    private final AiiaggxdtyService aiiaggxdtyService;

    public AiiaggxdtyController(AiiaggxdtyService aiiaggxdtyService) {
        this.aiiaggxdtyService = aiiaggxdtyService;
    }

    @Get("/")
    public String index() {
        return aiiaggxdtyService.getGreeting();
    }
}
