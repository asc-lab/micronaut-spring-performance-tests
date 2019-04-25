package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vanrceyzkk")
public class VanrceyzkkController {

    private final VanrceyzkkService vanrceyzkkService;

    public VanrceyzkkController(VanrceyzkkService vanrceyzkkService) {
        this.vanrceyzkkService = vanrceyzkkService;
    }

    @Get("/")
    public String index() {
        return vanrceyzkkService.getGreeting();
    }
}
