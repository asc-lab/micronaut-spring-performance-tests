package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/comultspgx")
public class ComultspgxController {

    private final ComultspgxService comultspgxService;

    public ComultspgxController(ComultspgxService comultspgxService) {
        this.comultspgxService = comultspgxService;
    }

    @Get("/")
    public String index() {
        return comultspgxService.getGreeting();
    }
}
