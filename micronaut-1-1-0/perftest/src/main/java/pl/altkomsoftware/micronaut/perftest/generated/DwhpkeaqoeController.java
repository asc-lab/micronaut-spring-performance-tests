package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dwhpkeaqoe")
public class DwhpkeaqoeController {

    private final DwhpkeaqoeService dwhpkeaqoeService;

    public DwhpkeaqoeController(DwhpkeaqoeService dwhpkeaqoeService) {
        this.dwhpkeaqoeService = dwhpkeaqoeService;
    }

    @Get("/")
    public String index() {
        return dwhpkeaqoeService.getGreeting();
    }
}
