package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bgcbsicoxw")
public class BgcbsicoxwController {

    private final BgcbsicoxwService bgcbsicoxwService;

    public BgcbsicoxwController(BgcbsicoxwService bgcbsicoxwService) {
        this.bgcbsicoxwService = bgcbsicoxwService;
    }

    @Get("/")
    public String index() {
        return bgcbsicoxwService.getGreeting();
    }
}
