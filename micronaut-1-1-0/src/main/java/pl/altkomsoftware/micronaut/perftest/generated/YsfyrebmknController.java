package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ysfyrebmkn")
public class YsfyrebmknController {

    private final YsfyrebmknService ysfyrebmknService;

    public YsfyrebmknController(YsfyrebmknService ysfyrebmknService) {
        this.ysfyrebmknService = ysfyrebmknService;
    }

    @Get("/")
    public String index() {
        return ysfyrebmknService.getGreeting();
    }
}
