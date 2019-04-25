package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/trtxajynct")
public class TrtxajynctController {

    private final TrtxajynctService trtxajynctService;

    public TrtxajynctController(TrtxajynctService trtxajynctService) {
        this.trtxajynctService = trtxajynctService;
    }

    @Get("/")
    public String index() {
        return trtxajynctService.getGreeting();
    }
}
