package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lpbythddur")
public class LpbythddurController {

    private final LpbythddurService lpbythddurService;

    public LpbythddurController(LpbythddurService lpbythddurService) {
        this.lpbythddurService = lpbythddurService;
    }

    @Get("/")
    public String index() {
        return lpbythddurService.getGreeting();
    }
}
