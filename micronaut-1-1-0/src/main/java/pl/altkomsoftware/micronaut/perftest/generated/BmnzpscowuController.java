package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bmnzpscowu")
public class BmnzpscowuController {

    private final BmnzpscowuService bmnzpscowuService;

    public BmnzpscowuController(BmnzpscowuService bmnzpscowuService) {
        this.bmnzpscowuService = bmnzpscowuService;
    }

    @Get("/")
    public String index() {
        return bmnzpscowuService.getGreeting();
    }
}
