package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hrnazgmahq")
public class HrnazgmahqController {

    private final HrnazgmahqService hrnazgmahqService;

    public HrnazgmahqController(HrnazgmahqService hrnazgmahqService) {
        this.hrnazgmahqService = hrnazgmahqService;
    }

    @Get("/")
    public String index() {
        return hrnazgmahqService.getGreeting();
    }
}
