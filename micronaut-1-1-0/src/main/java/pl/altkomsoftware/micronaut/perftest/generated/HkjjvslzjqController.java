package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hkjjvslzjq")
public class HkjjvslzjqController {

    private final HkjjvslzjqService hkjjvslzjqService;

    public HkjjvslzjqController(HkjjvslzjqService hkjjvslzjqService) {
        this.hkjjvslzjqService = hkjjvslzjqService;
    }

    @Get("/")
    public String index() {
        return hkjjvslzjqService.getGreeting();
    }
}
