package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yppjarfnaj")
public class YppjarfnajController {

    private final YppjarfnajService yppjarfnajService;

    public YppjarfnajController(YppjarfnajService yppjarfnajService) {
        this.yppjarfnajService = yppjarfnajService;
    }

    @Get("/")
    public String index() {
        return yppjarfnajService.getGreeting();
    }
}
