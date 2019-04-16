package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/srzdsphdlf")
public class SrzdsphdlfController {

    private final SrzdsphdlfService srzdsphdlfService;

    public SrzdsphdlfController(SrzdsphdlfService srzdsphdlfService) {
        this.srzdsphdlfService = srzdsphdlfService;
    }

    @Get("/")
    public String index() {
        return srzdsphdlfService.getGreeting();
    }
}
