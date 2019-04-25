package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ehqkcphohx")
public class EhqkcphohxController {

    private final EhqkcphohxService ehqkcphohxService;

    public EhqkcphohxController(EhqkcphohxService ehqkcphohxService) {
        this.ehqkcphohxService = ehqkcphohxService;
    }

    @Get("/")
    public String index() {
        return ehqkcphohxService.getGreeting();
    }
}
