package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cqqrxgdtug")
public class CqqrxgdtugController {

    private final CqqrxgdtugService cqqrxgdtugService;

    public CqqrxgdtugController(CqqrxgdtugService cqqrxgdtugService) {
        this.cqqrxgdtugService = cqqrxgdtugService;
    }

    @Get("/")
    public String index() {
        return cqqrxgdtugService.getGreeting();
    }
}
