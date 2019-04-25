package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/llibdzoict")
public class LlibdzoictController {

    private final LlibdzoictService llibdzoictService;

    public LlibdzoictController(LlibdzoictService llibdzoictService) {
        this.llibdzoictService = llibdzoictService;
    }

    @Get("/")
    public String index() {
        return llibdzoictService.getGreeting();
    }
}
