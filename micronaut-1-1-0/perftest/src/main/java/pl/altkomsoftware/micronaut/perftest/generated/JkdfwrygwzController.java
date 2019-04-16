package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jkdfwrygwz")
public class JkdfwrygwzController {

    private final JkdfwrygwzService jkdfwrygwzService;

    public JkdfwrygwzController(JkdfwrygwzService jkdfwrygwzService) {
        this.jkdfwrygwzService = jkdfwrygwzService;
    }

    @Get("/")
    public String index() {
        return jkdfwrygwzService.getGreeting();
    }
}
