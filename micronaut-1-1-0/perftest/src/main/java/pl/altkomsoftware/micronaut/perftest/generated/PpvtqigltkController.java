package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ppvtqigltk")
public class PpvtqigltkController {

    private final PpvtqigltkService ppvtqigltkService;

    public PpvtqigltkController(PpvtqigltkService ppvtqigltkService) {
        this.ppvtqigltkService = ppvtqigltkService;
    }

    @Get("/")
    public String index() {
        return ppvtqigltkService.getGreeting();
    }
}
