package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lkeijmqucf")
public class LkeijmqucfController {

    private final LkeijmqucfService lkeijmqucfService;

    public LkeijmqucfController(LkeijmqucfService lkeijmqucfService) {
        this.lkeijmqucfService = lkeijmqucfService;
    }

    @Get("/")
    public String index() {
        return lkeijmqucfService.getGreeting();
    }
}
