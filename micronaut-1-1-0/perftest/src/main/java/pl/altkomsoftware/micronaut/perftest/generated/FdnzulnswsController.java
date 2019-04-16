package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fdnzulnsws")
public class FdnzulnswsController {

    private final FdnzulnswsService fdnzulnswsService;

    public FdnzulnswsController(FdnzulnswsService fdnzulnswsService) {
        this.fdnzulnswsService = fdnzulnswsService;
    }

    @Get("/")
    public String index() {
        return fdnzulnswsService.getGreeting();
    }
}
