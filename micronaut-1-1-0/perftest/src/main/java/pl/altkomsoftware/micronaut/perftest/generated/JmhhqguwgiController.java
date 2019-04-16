package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jmhhqguwgi")
public class JmhhqguwgiController {

    private final JmhhqguwgiService jmhhqguwgiService;

    public JmhhqguwgiController(JmhhqguwgiService jmhhqguwgiService) {
        this.jmhhqguwgiService = jmhhqguwgiService;
    }

    @Get("/")
    public String index() {
        return jmhhqguwgiService.getGreeting();
    }
}
