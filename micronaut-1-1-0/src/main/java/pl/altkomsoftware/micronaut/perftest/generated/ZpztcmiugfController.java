package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zpztcmiugf")
public class ZpztcmiugfController {

    private final ZpztcmiugfService zpztcmiugfService;

    public ZpztcmiugfController(ZpztcmiugfService zpztcmiugfService) {
        this.zpztcmiugfService = zpztcmiugfService;
    }

    @Get("/")
    public String index() {
        return zpztcmiugfService.getGreeting();
    }
}
