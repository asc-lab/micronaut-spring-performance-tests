package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vblfvbotnl")
public class VblfvbotnlController {

    private final VblfvbotnlService vblfvbotnlService;

    public VblfvbotnlController(VblfvbotnlService vblfvbotnlService) {
        this.vblfvbotnlService = vblfvbotnlService;
    }

    @Get("/")
    public String index() {
        return vblfvbotnlService.getGreeting();
    }
}
