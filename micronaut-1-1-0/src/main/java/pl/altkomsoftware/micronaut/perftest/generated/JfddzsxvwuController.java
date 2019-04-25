package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jfddzsxvwu")
public class JfddzsxvwuController {

    private final JfddzsxvwuService jfddzsxvwuService;

    public JfddzsxvwuController(JfddzsxvwuService jfddzsxvwuService) {
        this.jfddzsxvwuService = jfddzsxvwuService;
    }

    @Get("/")
    public String index() {
        return jfddzsxvwuService.getGreeting();
    }
}
