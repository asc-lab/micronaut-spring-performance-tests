package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nbzwiyzdfk")
public class NbzwiyzdfkController {

    private final NbzwiyzdfkService nbzwiyzdfkService;

    public NbzwiyzdfkController(NbzwiyzdfkService nbzwiyzdfkService) {
        this.nbzwiyzdfkService = nbzwiyzdfkService;
    }

    @Get("/")
    public String index() {
        return nbzwiyzdfkService.getGreeting();
    }
}
