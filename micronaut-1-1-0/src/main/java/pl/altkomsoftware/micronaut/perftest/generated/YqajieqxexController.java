package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yqajieqxex")
public class YqajieqxexController {

    private final YqajieqxexService yqajieqxexService;

    public YqajieqxexController(YqajieqxexService yqajieqxexService) {
        this.yqajieqxexService = yqajieqxexService;
    }

    @Get("/")
    public String index() {
        return yqajieqxexService.getGreeting();
    }
}
