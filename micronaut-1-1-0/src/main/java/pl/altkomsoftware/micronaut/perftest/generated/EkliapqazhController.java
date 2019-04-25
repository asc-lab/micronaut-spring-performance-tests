package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ekliapqazh")
public class EkliapqazhController {

    private final EkliapqazhService ekliapqazhService;

    public EkliapqazhController(EkliapqazhService ekliapqazhService) {
        this.ekliapqazhService = ekliapqazhService;
    }

    @Get("/")
    public String index() {
        return ekliapqazhService.getGreeting();
    }
}
