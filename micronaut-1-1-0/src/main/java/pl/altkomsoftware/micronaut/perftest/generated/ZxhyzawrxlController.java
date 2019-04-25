package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zxhyzawrxl")
public class ZxhyzawrxlController {

    private final ZxhyzawrxlService zxhyzawrxlService;

    public ZxhyzawrxlController(ZxhyzawrxlService zxhyzawrxlService) {
        this.zxhyzawrxlService = zxhyzawrxlService;
    }

    @Get("/")
    public String index() {
        return zxhyzawrxlService.getGreeting();
    }
}
