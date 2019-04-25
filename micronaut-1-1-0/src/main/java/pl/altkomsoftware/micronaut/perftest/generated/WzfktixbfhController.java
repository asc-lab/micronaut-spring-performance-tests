package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wzfktixbfh")
public class WzfktixbfhController {

    private final WzfktixbfhService wzfktixbfhService;

    public WzfktixbfhController(WzfktixbfhService wzfktixbfhService) {
        this.wzfktixbfhService = wzfktixbfhService;
    }

    @Get("/")
    public String index() {
        return wzfktixbfhService.getGreeting();
    }
}
