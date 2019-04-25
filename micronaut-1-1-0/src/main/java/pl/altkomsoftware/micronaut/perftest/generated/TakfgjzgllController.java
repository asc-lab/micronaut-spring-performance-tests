package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/takfgjzgll")
public class TakfgjzgllController {

    private final TakfgjzgllService takfgjzgllService;

    public TakfgjzgllController(TakfgjzgllService takfgjzgllService) {
        this.takfgjzgllService = takfgjzgllService;
    }

    @Get("/")
    public String index() {
        return takfgjzgllService.getGreeting();
    }
}
