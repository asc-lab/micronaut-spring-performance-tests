package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gsshahbdca")
public class GsshahbdcaController {

    private final GsshahbdcaService gsshahbdcaService;

    public GsshahbdcaController(GsshahbdcaService gsshahbdcaService) {
        this.gsshahbdcaService = gsshahbdcaService;
    }

    @Get("/")
    public String index() {
        return gsshahbdcaService.getGreeting();
    }
}
