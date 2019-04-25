package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zvkxxvedlf")
public class ZvkxxvedlfController {

    private final ZvkxxvedlfService zvkxxvedlfService;

    public ZvkxxvedlfController(ZvkxxvedlfService zvkxxvedlfService) {
        this.zvkxxvedlfService = zvkxxvedlfService;
    }

    @Get("/")
    public String index() {
        return zvkxxvedlfService.getGreeting();
    }
}
