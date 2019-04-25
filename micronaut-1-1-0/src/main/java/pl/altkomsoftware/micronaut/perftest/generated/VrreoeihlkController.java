package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vrreoeihlk")
public class VrreoeihlkController {

    private final VrreoeihlkService vrreoeihlkService;

    public VrreoeihlkController(VrreoeihlkService vrreoeihlkService) {
        this.vrreoeihlkService = vrreoeihlkService;
    }

    @Get("/")
    public String index() {
        return vrreoeihlkService.getGreeting();
    }
}
