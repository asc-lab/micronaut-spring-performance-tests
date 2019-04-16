package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zkhcxfouyk")
public class ZkhcxfouykController {

    private final ZkhcxfouykService zkhcxfouykService;

    public ZkhcxfouykController(ZkhcxfouykService zkhcxfouykService) {
        this.zkhcxfouykService = zkhcxfouykService;
    }

    @Get("/")
    public String index() {
        return zkhcxfouykService.getGreeting();
    }
}
