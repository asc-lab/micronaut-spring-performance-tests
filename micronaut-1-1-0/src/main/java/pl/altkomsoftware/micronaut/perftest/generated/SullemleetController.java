package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sullemleet")
public class SullemleetController {

    private final SullemleetService sullemleetService;

    public SullemleetController(SullemleetService sullemleetService) {
        this.sullemleetService = sullemleetService;
    }

    @Get("/")
    public String index() {
        return sullemleetService.getGreeting();
    }
}
