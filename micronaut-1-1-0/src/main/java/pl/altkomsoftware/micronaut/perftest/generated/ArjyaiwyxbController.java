package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/arjyaiwyxb")
public class ArjyaiwyxbController {

    private final ArjyaiwyxbService arjyaiwyxbService;

    public ArjyaiwyxbController(ArjyaiwyxbService arjyaiwyxbService) {
        this.arjyaiwyxbService = arjyaiwyxbService;
    }

    @Get("/")
    public String index() {
        return arjyaiwyxbService.getGreeting();
    }
}
