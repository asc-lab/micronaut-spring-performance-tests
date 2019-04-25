package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sqcdkycvjt")
public class SqcdkycvjtController {

    private final SqcdkycvjtService sqcdkycvjtService;

    public SqcdkycvjtController(SqcdkycvjtService sqcdkycvjtService) {
        this.sqcdkycvjtService = sqcdkycvjtService;
    }

    @Get("/")
    public String index() {
        return sqcdkycvjtService.getGreeting();
    }
}
