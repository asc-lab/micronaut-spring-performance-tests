package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yeqgusvtfb")
public class YeqgusvtfbController {

    private final YeqgusvtfbService yeqgusvtfbService;

    public YeqgusvtfbController(YeqgusvtfbService yeqgusvtfbService) {
        this.yeqgusvtfbService = yeqgusvtfbService;
    }

    @Get("/")
    public String index() {
        return yeqgusvtfbService.getGreeting();
    }
}
