package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zjoegtenvo")
public class ZjoegtenvoController {

    private final ZjoegtenvoService zjoegtenvoService;

    public ZjoegtenvoController(ZjoegtenvoService zjoegtenvoService) {
        this.zjoegtenvoService = zjoegtenvoService;
    }

    @Get("/")
    public String index() {
        return zjoegtenvoService.getGreeting();
    }
}
