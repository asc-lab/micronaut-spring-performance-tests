package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ixhmpdlzfn")
public class IxhmpdlzfnController {

    private final IxhmpdlzfnService ixhmpdlzfnService;

    public IxhmpdlzfnController(IxhmpdlzfnService ixhmpdlzfnService) {
        this.ixhmpdlzfnService = ixhmpdlzfnService;
    }

    @Get("/")
    public String index() {
        return ixhmpdlzfnService.getGreeting();
    }
}
