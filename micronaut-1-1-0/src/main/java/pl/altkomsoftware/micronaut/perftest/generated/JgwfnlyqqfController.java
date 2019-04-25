package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jgwfnlyqqf")
public class JgwfnlyqqfController {

    private final JgwfnlyqqfService jgwfnlyqqfService;

    public JgwfnlyqqfController(JgwfnlyqqfService jgwfnlyqqfService) {
        this.jgwfnlyqqfService = jgwfnlyqqfService;
    }

    @Get("/")
    public String index() {
        return jgwfnlyqqfService.getGreeting();
    }
}
