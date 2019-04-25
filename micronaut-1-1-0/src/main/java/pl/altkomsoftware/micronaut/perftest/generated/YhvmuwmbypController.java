package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yhvmuwmbyp")
public class YhvmuwmbypController {

    private final YhvmuwmbypService yhvmuwmbypService;

    public YhvmuwmbypController(YhvmuwmbypService yhvmuwmbypService) {
        this.yhvmuwmbypService = yhvmuwmbypService;
    }

    @Get("/")
    public String index() {
        return yhvmuwmbypService.getGreeting();
    }
}
