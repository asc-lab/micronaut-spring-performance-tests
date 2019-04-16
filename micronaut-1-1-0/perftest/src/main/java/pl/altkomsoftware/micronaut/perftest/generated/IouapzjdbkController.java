package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iouapzjdbk")
public class IouapzjdbkController {

    private final IouapzjdbkService iouapzjdbkService;

    public IouapzjdbkController(IouapzjdbkService iouapzjdbkService) {
        this.iouapzjdbkService = iouapzjdbkService;
    }

    @Get("/")
    public String index() {
        return iouapzjdbkService.getGreeting();
    }
}
