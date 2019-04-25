package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cqqgwjunbz")
public class CqqgwjunbzController {

    private final CqqgwjunbzService cqqgwjunbzService;

    public CqqgwjunbzController(CqqgwjunbzService cqqgwjunbzService) {
        this.cqqgwjunbzService = cqqgwjunbzService;
    }

    @Get("/")
    public String index() {
        return cqqgwjunbzService.getGreeting();
    }
}
