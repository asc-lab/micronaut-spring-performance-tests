package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yekaleolce")
public class YekaleolceController {

    private final YekaleolceService yekaleolceService;

    public YekaleolceController(YekaleolceService yekaleolceService) {
        this.yekaleolceService = yekaleolceService;
    }

    @Get("/")
    public String index() {
        return yekaleolceService.getGreeting();
    }
}
