package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/izjctbwkxg")
public class IzjctbwkxgController {

    private final IzjctbwkxgService izjctbwkxgService;

    public IzjctbwkxgController(IzjctbwkxgService izjctbwkxgService) {
        this.izjctbwkxgService = izjctbwkxgService;
    }

    @Get("/")
    public String index() {
        return izjctbwkxgService.getGreeting();
    }
}
