package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aihrpsmoof")
public class AihrpsmoofController {

    private final AihrpsmoofService aihrpsmoofService;

    public AihrpsmoofController(AihrpsmoofService aihrpsmoofService) {
        this.aihrpsmoofService = aihrpsmoofService;
    }

    @Get("/")
    public String index() {
        return aihrpsmoofService.getGreeting();
    }
}
