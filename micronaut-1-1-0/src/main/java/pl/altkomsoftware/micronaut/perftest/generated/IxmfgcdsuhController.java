package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ixmfgcdsuh")
public class IxmfgcdsuhController {

    private final IxmfgcdsuhService ixmfgcdsuhService;

    public IxmfgcdsuhController(IxmfgcdsuhService ixmfgcdsuhService) {
        this.ixmfgcdsuhService = ixmfgcdsuhService;
    }

    @Get("/")
    public String index() {
        return ixmfgcdsuhService.getGreeting();
    }
}
