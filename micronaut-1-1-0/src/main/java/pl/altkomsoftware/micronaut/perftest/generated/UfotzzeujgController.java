package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ufotzzeujg")
public class UfotzzeujgController {

    private final UfotzzeujgService ufotzzeujgService;

    public UfotzzeujgController(UfotzzeujgService ufotzzeujgService) {
        this.ufotzzeujgService = ufotzzeujgService;
    }

    @Get("/")
    public String index() {
        return ufotzzeujgService.getGreeting();
    }
}
