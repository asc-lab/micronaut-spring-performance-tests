package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zbzernvyxj")
public class ZbzernvyxjController {

    private final ZbzernvyxjService zbzernvyxjService;

    public ZbzernvyxjController(ZbzernvyxjService zbzernvyxjService) {
        this.zbzernvyxjService = zbzernvyxjService;
    }

    @Get("/")
    public String index() {
        return zbzernvyxjService.getGreeting();
    }
}
