package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yuulghavie")
public class YuulghavieController {

    private final YuulghavieService yuulghavieService;

    public YuulghavieController(YuulghavieService yuulghavieService) {
        this.yuulghavieService = yuulghavieService;
    }

    @Get("/")
    public String index() {
        return yuulghavieService.getGreeting();
    }
}
