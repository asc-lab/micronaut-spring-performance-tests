package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ouyvwxppfs")
public class OuyvwxppfsController {

    private final OuyvwxppfsService ouyvwxppfsService;

    public OuyvwxppfsController(OuyvwxppfsService ouyvwxppfsService) {
        this.ouyvwxppfsService = ouyvwxppfsService;
    }

    @Get("/")
    public String index() {
        return ouyvwxppfsService.getGreeting();
    }
}
