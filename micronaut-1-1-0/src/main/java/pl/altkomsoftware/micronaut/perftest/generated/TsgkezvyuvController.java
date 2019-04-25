package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tsgkezvyuv")
public class TsgkezvyuvController {

    private final TsgkezvyuvService tsgkezvyuvService;

    public TsgkezvyuvController(TsgkezvyuvService tsgkezvyuvService) {
        this.tsgkezvyuvService = tsgkezvyuvService;
    }

    @Get("/")
    public String index() {
        return tsgkezvyuvService.getGreeting();
    }
}
