package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zxnbbpdkhr")
public class ZxnbbpdkhrController {

    private final ZxnbbpdkhrService zxnbbpdkhrService;

    public ZxnbbpdkhrController(ZxnbbpdkhrService zxnbbpdkhrService) {
        this.zxnbbpdkhrService = zxnbbpdkhrService;
    }

    @Get("/")
    public String index() {
        return zxnbbpdkhrService.getGreeting();
    }
}
