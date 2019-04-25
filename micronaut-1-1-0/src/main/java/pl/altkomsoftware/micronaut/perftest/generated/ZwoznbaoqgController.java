package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zwoznbaoqg")
public class ZwoznbaoqgController {

    private final ZwoznbaoqgService zwoznbaoqgService;

    public ZwoznbaoqgController(ZwoznbaoqgService zwoznbaoqgService) {
        this.zwoznbaoqgService = zwoznbaoqgService;
    }

    @Get("/")
    public String index() {
        return zwoznbaoqgService.getGreeting();
    }
}
