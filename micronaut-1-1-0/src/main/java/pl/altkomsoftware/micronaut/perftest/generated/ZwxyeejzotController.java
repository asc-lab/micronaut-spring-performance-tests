package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zwxyeejzot")
public class ZwxyeejzotController {

    private final ZwxyeejzotService zwxyeejzotService;

    public ZwxyeejzotController(ZwxyeejzotService zwxyeejzotService) {
        this.zwxyeejzotService = zwxyeejzotService;
    }

    @Get("/")
    public String index() {
        return zwxyeejzotService.getGreeting();
    }
}
