package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zzknbwwyha")
public class ZzknbwwyhaController {

    private final ZzknbwwyhaService zzknbwwyhaService;

    public ZzknbwwyhaController(ZzknbwwyhaService zzknbwwyhaService) {
        this.zzknbwwyhaService = zzknbwwyhaService;
    }

    @Get("/")
    public String index() {
        return zzknbwwyhaService.getGreeting();
    }
}
