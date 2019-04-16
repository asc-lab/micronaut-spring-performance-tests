package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pdrwodtvie")
public class PdrwodtvieController {

    private final PdrwodtvieService pdrwodtvieService;

    public PdrwodtvieController(PdrwodtvieService pdrwodtvieService) {
        this.pdrwodtvieService = pdrwodtvieService;
    }

    @Get("/")
    public String index() {
        return pdrwodtvieService.getGreeting();
    }
}
