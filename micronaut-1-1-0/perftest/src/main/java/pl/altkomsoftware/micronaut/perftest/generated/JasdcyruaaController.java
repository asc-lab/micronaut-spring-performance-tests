package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jasdcyruaa")
public class JasdcyruaaController {

    private final JasdcyruaaService jasdcyruaaService;

    public JasdcyruaaController(JasdcyruaaService jasdcyruaaService) {
        this.jasdcyruaaService = jasdcyruaaService;
    }

    @Get("/")
    public String index() {
        return jasdcyruaaService.getGreeting();
    }
}
