package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jtitgttzqr")
public class JtitgttzqrController {

    private final JtitgttzqrService jtitgttzqrService;

    public JtitgttzqrController(JtitgttzqrService jtitgttzqrService) {
        this.jtitgttzqrService = jtitgttzqrService;
    }

    @Get("/")
    public String index() {
        return jtitgttzqrService.getGreeting();
    }
}
