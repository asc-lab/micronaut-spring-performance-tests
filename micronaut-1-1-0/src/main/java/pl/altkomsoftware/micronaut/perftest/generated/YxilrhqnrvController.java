package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yxilrhqnrv")
public class YxilrhqnrvController {

    private final YxilrhqnrvService yxilrhqnrvService;

    public YxilrhqnrvController(YxilrhqnrvService yxilrhqnrvService) {
        this.yxilrhqnrvService = yxilrhqnrvService;
    }

    @Get("/")
    public String index() {
        return yxilrhqnrvService.getGreeting();
    }
}
