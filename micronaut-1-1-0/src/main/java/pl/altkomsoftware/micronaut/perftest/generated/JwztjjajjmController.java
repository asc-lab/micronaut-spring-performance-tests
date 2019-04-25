package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jwztjjajjm")
public class JwztjjajjmController {

    private final JwztjjajjmService jwztjjajjmService;

    public JwztjjajjmController(JwztjjajjmService jwztjjajjmService) {
        this.jwztjjajjmService = jwztjjajjmService;
    }

    @Get("/")
    public String index() {
        return jwztjjajjmService.getGreeting();
    }
}
