package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tseqytbgzx")
public class TseqytbgzxController {

    private final TseqytbgzxService tseqytbgzxService;

    public TseqytbgzxController(TseqytbgzxService tseqytbgzxService) {
        this.tseqytbgzxService = tseqytbgzxService;
    }

    @Get("/")
    public String index() {
        return tseqytbgzxService.getGreeting();
    }
}
