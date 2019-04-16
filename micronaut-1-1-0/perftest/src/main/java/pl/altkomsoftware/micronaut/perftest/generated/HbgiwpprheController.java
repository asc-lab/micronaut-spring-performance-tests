package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hbgiwpprhe")
public class HbgiwpprheController {

    private final HbgiwpprheService hbgiwpprheService;

    public HbgiwpprheController(HbgiwpprheService hbgiwpprheService) {
        this.hbgiwpprheService = hbgiwpprheService;
    }

    @Get("/")
    public String index() {
        return hbgiwpprheService.getGreeting();
    }
}
