package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vdimflojlr")
public class VdimflojlrController {

    private final VdimflojlrService vdimflojlrService;

    public VdimflojlrController(VdimflojlrService vdimflojlrService) {
        this.vdimflojlrService = vdimflojlrService;
    }

    @Get("/")
    public String index() {
        return vdimflojlrService.getGreeting();
    }
}
