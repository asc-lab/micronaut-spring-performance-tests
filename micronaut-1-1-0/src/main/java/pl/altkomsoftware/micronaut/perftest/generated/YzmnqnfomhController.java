package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yzmnqnfomh")
public class YzmnqnfomhController {

    private final YzmnqnfomhService yzmnqnfomhService;

    public YzmnqnfomhController(YzmnqnfomhService yzmnqnfomhService) {
        this.yzmnqnfomhService = yzmnqnfomhService;
    }

    @Get("/")
    public String index() {
        return yzmnqnfomhService.getGreeting();
    }
}
