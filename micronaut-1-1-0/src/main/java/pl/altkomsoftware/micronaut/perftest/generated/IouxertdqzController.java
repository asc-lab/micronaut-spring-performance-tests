package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iouxertdqz")
public class IouxertdqzController {

    private final IouxertdqzService iouxertdqzService;

    public IouxertdqzController(IouxertdqzService iouxertdqzService) {
        this.iouxertdqzService = iouxertdqzService;
    }

    @Get("/")
    public String index() {
        return iouxertdqzService.getGreeting();
    }
}
