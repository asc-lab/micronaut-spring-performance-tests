package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/smkuhixjfw")
public class SmkuhixjfwController {

    private final SmkuhixjfwService smkuhixjfwService;

    public SmkuhixjfwController(SmkuhixjfwService smkuhixjfwService) {
        this.smkuhixjfwService = smkuhixjfwService;
    }

    @Get("/")
    public String index() {
        return smkuhixjfwService.getGreeting();
    }
}
