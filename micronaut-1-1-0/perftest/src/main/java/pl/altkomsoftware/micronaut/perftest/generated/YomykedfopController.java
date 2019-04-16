package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yomykedfop")
public class YomykedfopController {

    private final YomykedfopService yomykedfopService;

    public YomykedfopController(YomykedfopService yomykedfopService) {
        this.yomykedfopService = yomykedfopService;
    }

    @Get("/")
    public String index() {
        return yomykedfopService.getGreeting();
    }
}
