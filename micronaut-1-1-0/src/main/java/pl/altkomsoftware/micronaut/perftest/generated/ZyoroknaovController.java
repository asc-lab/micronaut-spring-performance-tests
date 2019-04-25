package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zyoroknaov")
public class ZyoroknaovController {

    private final ZyoroknaovService zyoroknaovService;

    public ZyoroknaovController(ZyoroknaovService zyoroknaovService) {
        this.zyoroknaovService = zyoroknaovService;
    }

    @Get("/")
    public String index() {
        return zyoroknaovService.getGreeting();
    }
}
