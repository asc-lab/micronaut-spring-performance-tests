package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rcklxtbzdz")
public class RcklxtbzdzController {

    private final RcklxtbzdzService rcklxtbzdzService;

    public RcklxtbzdzController(RcklxtbzdzService rcklxtbzdzService) {
        this.rcklxtbzdzService = rcklxtbzdzService;
    }

    @Get("/")
    public String index() {
        return rcklxtbzdzService.getGreeting();
    }
}
