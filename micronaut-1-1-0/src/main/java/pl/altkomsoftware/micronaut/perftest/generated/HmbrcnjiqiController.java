package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hmbrcnjiqi")
public class HmbrcnjiqiController {

    private final HmbrcnjiqiService hmbrcnjiqiService;

    public HmbrcnjiqiController(HmbrcnjiqiService hmbrcnjiqiService) {
        this.hmbrcnjiqiService = hmbrcnjiqiService;
    }

    @Get("/")
    public String index() {
        return hmbrcnjiqiService.getGreeting();
    }
}
