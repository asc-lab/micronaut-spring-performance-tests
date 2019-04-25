package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yakvvcjbzl")
public class YakvvcjbzlController {

    private final YakvvcjbzlService yakvvcjbzlService;

    public YakvvcjbzlController(YakvvcjbzlService yakvvcjbzlService) {
        this.yakvvcjbzlService = yakvvcjbzlService;
    }

    @Get("/")
    public String index() {
        return yakvvcjbzlService.getGreeting();
    }
}
