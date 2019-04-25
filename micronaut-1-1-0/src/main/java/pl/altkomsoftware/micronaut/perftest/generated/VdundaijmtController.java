package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vdundaijmt")
public class VdundaijmtController {

    private final VdundaijmtService vdundaijmtService;

    public VdundaijmtController(VdundaijmtService vdundaijmtService) {
        this.vdundaijmtService = vdundaijmtService;
    }

    @Get("/")
    public String index() {
        return vdundaijmtService.getGreeting();
    }
}
