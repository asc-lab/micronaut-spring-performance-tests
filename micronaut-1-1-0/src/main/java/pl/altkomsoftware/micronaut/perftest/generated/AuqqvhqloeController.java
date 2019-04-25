package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/auqqvhqloe")
public class AuqqvhqloeController {

    private final AuqqvhqloeService auqqvhqloeService;

    public AuqqvhqloeController(AuqqvhqloeService auqqvhqloeService) {
        this.auqqvhqloeService = auqqvhqloeService;
    }

    @Get("/")
    public String index() {
        return auqqvhqloeService.getGreeting();
    }
}
