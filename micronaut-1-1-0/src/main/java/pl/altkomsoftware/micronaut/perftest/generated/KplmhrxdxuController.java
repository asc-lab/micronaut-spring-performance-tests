package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kplmhrxdxu")
public class KplmhrxdxuController {

    private final KplmhrxdxuService kplmhrxdxuService;

    public KplmhrxdxuController(KplmhrxdxuService kplmhrxdxuService) {
        this.kplmhrxdxuService = kplmhrxdxuService;
    }

    @Get("/")
    public String index() {
        return kplmhrxdxuService.getGreeting();
    }
}
