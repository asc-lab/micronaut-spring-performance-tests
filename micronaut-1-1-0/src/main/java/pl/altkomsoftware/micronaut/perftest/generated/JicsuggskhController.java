package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jicsuggskh")
public class JicsuggskhController {

    private final JicsuggskhService jicsuggskhService;

    public JicsuggskhController(JicsuggskhService jicsuggskhService) {
        this.jicsuggskhService = jicsuggskhService;
    }

    @Get("/")
    public String index() {
        return jicsuggskhService.getGreeting();
    }
}
