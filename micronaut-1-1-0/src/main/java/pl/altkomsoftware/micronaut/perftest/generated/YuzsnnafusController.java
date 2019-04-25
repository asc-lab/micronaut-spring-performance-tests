package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yuzsnnafus")
public class YuzsnnafusController {

    private final YuzsnnafusService yuzsnnafusService;

    public YuzsnnafusController(YuzsnnafusService yuzsnnafusService) {
        this.yuzsnnafusService = yuzsnnafusService;
    }

    @Get("/")
    public String index() {
        return yuzsnnafusService.getGreeting();
    }
}
