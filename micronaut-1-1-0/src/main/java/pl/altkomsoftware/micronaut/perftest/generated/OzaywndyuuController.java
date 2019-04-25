package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ozaywndyuu")
public class OzaywndyuuController {

    private final OzaywndyuuService ozaywndyuuService;

    public OzaywndyuuController(OzaywndyuuService ozaywndyuuService) {
        this.ozaywndyuuService = ozaywndyuuService;
    }

    @Get("/")
    public String index() {
        return ozaywndyuuService.getGreeting();
    }
}
