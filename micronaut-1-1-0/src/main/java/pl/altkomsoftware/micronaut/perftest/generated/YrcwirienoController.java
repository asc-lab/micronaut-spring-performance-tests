package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yrcwirieno")
public class YrcwirienoController {

    private final YrcwirienoService yrcwirienoService;

    public YrcwirienoController(YrcwirienoService yrcwirienoService) {
        this.yrcwirienoService = yrcwirienoService;
    }

    @Get("/")
    public String index() {
        return yrcwirienoService.getGreeting();
    }
}
