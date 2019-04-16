package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zfuqbtpmqw")
public class ZfuqbtpmqwController {

    private final ZfuqbtpmqwService zfuqbtpmqwService;

    public ZfuqbtpmqwController(ZfuqbtpmqwService zfuqbtpmqwService) {
        this.zfuqbtpmqwService = zfuqbtpmqwService;
    }

    @Get("/")
    public String index() {
        return zfuqbtpmqwService.getGreeting();
    }
}
