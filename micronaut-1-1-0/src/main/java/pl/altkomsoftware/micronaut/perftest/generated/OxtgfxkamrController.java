package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oxtgfxkamr")
public class OxtgfxkamrController {

    private final OxtgfxkamrService oxtgfxkamrService;

    public OxtgfxkamrController(OxtgfxkamrService oxtgfxkamrService) {
        this.oxtgfxkamrService = oxtgfxkamrService;
    }

    @Get("/")
    public String index() {
        return oxtgfxkamrService.getGreeting();
    }
}
