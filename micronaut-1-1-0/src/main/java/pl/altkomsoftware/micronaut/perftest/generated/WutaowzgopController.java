package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wutaowzgop")
public class WutaowzgopController {

    private final WutaowzgopService wutaowzgopService;

    public WutaowzgopController(WutaowzgopService wutaowzgopService) {
        this.wutaowzgopService = wutaowzgopService;
    }

    @Get("/")
    public String index() {
        return wutaowzgopService.getGreeting();
    }
}
