package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/btrjxsxxeo")
public class BtrjxsxxeoController {

    private final BtrjxsxxeoService btrjxsxxeoService;

    public BtrjxsxxeoController(BtrjxsxxeoService btrjxsxxeoService) {
        this.btrjxsxxeoService = btrjxsxxeoService;
    }

    @Get("/")
    public String index() {
        return btrjxsxxeoService.getGreeting();
    }
}
