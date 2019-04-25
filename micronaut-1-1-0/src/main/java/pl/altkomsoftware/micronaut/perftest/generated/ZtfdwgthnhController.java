package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ztfdwgthnh")
public class ZtfdwgthnhController {

    private final ZtfdwgthnhService ztfdwgthnhService;

    public ZtfdwgthnhController(ZtfdwgthnhService ztfdwgthnhService) {
        this.ztfdwgthnhService = ztfdwgthnhService;
    }

    @Get("/")
    public String index() {
        return ztfdwgthnhService.getGreeting();
    }
}
