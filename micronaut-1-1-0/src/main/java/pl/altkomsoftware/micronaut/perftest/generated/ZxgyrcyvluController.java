package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zxgyrcyvlu")
public class ZxgyrcyvluController {

    private final ZxgyrcyvluService zxgyrcyvluService;

    public ZxgyrcyvluController(ZxgyrcyvluService zxgyrcyvluService) {
        this.zxgyrcyvluService = zxgyrcyvluService;
    }

    @Get("/")
    public String index() {
        return zxgyrcyvluService.getGreeting();
    }
}
