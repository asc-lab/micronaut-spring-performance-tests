package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ckxiqkpmls")
public class CkxiqkpmlsController {

    private final CkxiqkpmlsService ckxiqkpmlsService;

    public CkxiqkpmlsController(CkxiqkpmlsService ckxiqkpmlsService) {
        this.ckxiqkpmlsService = ckxiqkpmlsService;
    }

    @Get("/")
    public String index() {
        return ckxiqkpmlsService.getGreeting();
    }
}
