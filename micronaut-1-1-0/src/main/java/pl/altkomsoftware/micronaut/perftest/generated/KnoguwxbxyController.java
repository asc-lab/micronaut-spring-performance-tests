package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/knoguwxbxy")
public class KnoguwxbxyController {

    private final KnoguwxbxyService knoguwxbxyService;

    public KnoguwxbxyController(KnoguwxbxyService knoguwxbxyService) {
        this.knoguwxbxyService = knoguwxbxyService;
    }

    @Get("/")
    public String index() {
        return knoguwxbxyService.getGreeting();
    }
}
