package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cjcnmngeju")
public class CjcnmngejuController {

    private final CjcnmngejuService cjcnmngejuService;

    public CjcnmngejuController(CjcnmngejuService cjcnmngejuService) {
        this.cjcnmngejuService = cjcnmngejuService;
    }

    @Get("/")
    public String index() {
        return cjcnmngejuService.getGreeting();
    }
}
