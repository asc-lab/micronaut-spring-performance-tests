package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kkwcxqjfhk")
public class KkwcxqjfhkController {

    private final KkwcxqjfhkService kkwcxqjfhkService;

    public KkwcxqjfhkController(KkwcxqjfhkService kkwcxqjfhkService) {
        this.kkwcxqjfhkService = kkwcxqjfhkService;
    }

    @Get("/")
    public String index() {
        return kkwcxqjfhkService.getGreeting();
    }
}
