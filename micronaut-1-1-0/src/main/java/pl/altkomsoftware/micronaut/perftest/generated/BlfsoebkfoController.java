package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/blfsoebkfo")
public class BlfsoebkfoController {

    private final BlfsoebkfoService blfsoebkfoService;

    public BlfsoebkfoController(BlfsoebkfoService blfsoebkfoService) {
        this.blfsoebkfoService = blfsoebkfoService;
    }

    @Get("/")
    public String index() {
        return blfsoebkfoService.getGreeting();
    }
}
