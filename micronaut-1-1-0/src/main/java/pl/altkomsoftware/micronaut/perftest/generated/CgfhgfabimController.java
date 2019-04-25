package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cgfhgfabim")
public class CgfhgfabimController {

    private final CgfhgfabimService cgfhgfabimService;

    public CgfhgfabimController(CgfhgfabimService cgfhgfabimService) {
        this.cgfhgfabimService = cgfhgfabimService;
    }

    @Get("/")
    public String index() {
        return cgfhgfabimService.getGreeting();
    }
}
