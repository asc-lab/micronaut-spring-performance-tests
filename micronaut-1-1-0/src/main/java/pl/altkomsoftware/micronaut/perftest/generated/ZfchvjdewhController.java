package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zfchvjdewh")
public class ZfchvjdewhController {

    private final ZfchvjdewhService zfchvjdewhService;

    public ZfchvjdewhController(ZfchvjdewhService zfchvjdewhService) {
        this.zfchvjdewhService = zfchvjdewhService;
    }

    @Get("/")
    public String index() {
        return zfchvjdewhService.getGreeting();
    }
}
