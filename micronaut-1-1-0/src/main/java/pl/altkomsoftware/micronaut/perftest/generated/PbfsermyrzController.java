package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pbfsermyrz")
public class PbfsermyrzController {

    private final PbfsermyrzService pbfsermyrzService;

    public PbfsermyrzController(PbfsermyrzService pbfsermyrzService) {
        this.pbfsermyrzService = pbfsermyrzService;
    }

    @Get("/")
    public String index() {
        return pbfsermyrzService.getGreeting();
    }
}
