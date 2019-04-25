package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mgksdyzyih")
public class MgksdyzyihController {

    private final MgksdyzyihService mgksdyzyihService;

    public MgksdyzyihController(MgksdyzyihService mgksdyzyihService) {
        this.mgksdyzyihService = mgksdyzyihService;
    }

    @Get("/")
    public String index() {
        return mgksdyzyihService.getGreeting();
    }
}
