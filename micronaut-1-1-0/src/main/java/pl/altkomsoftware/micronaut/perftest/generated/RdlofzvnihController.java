package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rdlofzvnih")
public class RdlofzvnihController {

    private final RdlofzvnihService rdlofzvnihService;

    public RdlofzvnihController(RdlofzvnihService rdlofzvnihService) {
        this.rdlofzvnihService = rdlofzvnihService;
    }

    @Get("/")
    public String index() {
        return rdlofzvnihService.getGreeting();
    }
}
