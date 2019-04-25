package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eoyxkfjruk")
public class EoyxkfjrukController {

    private final EoyxkfjrukService eoyxkfjrukService;

    public EoyxkfjrukController(EoyxkfjrukService eoyxkfjrukService) {
        this.eoyxkfjrukService = eoyxkfjrukService;
    }

    @Get("/")
    public String index() {
        return eoyxkfjrukService.getGreeting();
    }
}
