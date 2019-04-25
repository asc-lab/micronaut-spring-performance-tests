package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yqtzwjdojy")
public class YqtzwjdojyController {

    private final YqtzwjdojyService yqtzwjdojyService;

    public YqtzwjdojyController(YqtzwjdojyService yqtzwjdojyService) {
        this.yqtzwjdojyService = yqtzwjdojyService;
    }

    @Get("/")
    public String index() {
        return yqtzwjdojyService.getGreeting();
    }
}
