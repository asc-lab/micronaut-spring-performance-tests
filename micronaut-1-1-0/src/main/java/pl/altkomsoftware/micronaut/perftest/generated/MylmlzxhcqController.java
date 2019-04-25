package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mylmlzxhcq")
public class MylmlzxhcqController {

    private final MylmlzxhcqService mylmlzxhcqService;

    public MylmlzxhcqController(MylmlzxhcqService mylmlzxhcqService) {
        this.mylmlzxhcqService = mylmlzxhcqService;
    }

    @Get("/")
    public String index() {
        return mylmlzxhcqService.getGreeting();
    }
}
