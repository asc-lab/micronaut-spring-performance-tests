package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dfnzrsbrph")
public class DfnzrsbrphController {

    private final DfnzrsbrphService dfnzrsbrphService;

    public DfnzrsbrphController(DfnzrsbrphService dfnzrsbrphService) {
        this.dfnzrsbrphService = dfnzrsbrphService;
    }

    @Get("/")
    public String index() {
        return dfnzrsbrphService.getGreeting();
    }
}
