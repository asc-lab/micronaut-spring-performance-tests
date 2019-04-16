package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ehfdtwzelx")
public class EhfdtwzelxController {

    private final EhfdtwzelxService ehfdtwzelxService;

    public EhfdtwzelxController(EhfdtwzelxService ehfdtwzelxService) {
        this.ehfdtwzelxService = ehfdtwzelxService;
    }

    @Get("/")
    public String index() {
        return ehfdtwzelxService.getGreeting();
    }
}
