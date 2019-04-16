package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kxuqwzvcax")
public class KxuqwzvcaxController {

    private final KxuqwzvcaxService kxuqwzvcaxService;

    public KxuqwzvcaxController(KxuqwzvcaxService kxuqwzvcaxService) {
        this.kxuqwzvcaxService = kxuqwzvcaxService;
    }

    @Get("/")
    public String index() {
        return kxuqwzvcaxService.getGreeting();
    }
}
