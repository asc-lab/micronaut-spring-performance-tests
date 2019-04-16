package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kbqwobqpdi")
public class KbqwobqpdiController {

    private final KbqwobqpdiService kbqwobqpdiService;

    public KbqwobqpdiController(KbqwobqpdiService kbqwobqpdiService) {
        this.kbqwobqpdiService = kbqwobqpdiService;
    }

    @Get("/")
    public String index() {
        return kbqwobqpdiService.getGreeting();
    }
}
