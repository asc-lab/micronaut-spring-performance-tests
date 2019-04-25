package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rwuypzcotk")
public class RwuypzcotkController {

    private final RwuypzcotkService rwuypzcotkService;

    public RwuypzcotkController(RwuypzcotkService rwuypzcotkService) {
        this.rwuypzcotkService = rwuypzcotkService;
    }

    @Get("/")
    public String index() {
        return rwuypzcotkService.getGreeting();
    }
}
