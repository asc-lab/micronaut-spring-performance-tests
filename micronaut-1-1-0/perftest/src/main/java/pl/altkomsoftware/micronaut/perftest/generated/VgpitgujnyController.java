package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vgpitgujny")
public class VgpitgujnyController {

    private final VgpitgujnyService vgpitgujnyService;

    public VgpitgujnyController(VgpitgujnyService vgpitgujnyService) {
        this.vgpitgujnyService = vgpitgujnyService;
    }

    @Get("/")
    public String index() {
        return vgpitgujnyService.getGreeting();
    }
}
