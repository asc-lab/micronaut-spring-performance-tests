package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lmhswryqpf")
public class LmhswryqpfController {

    private final LmhswryqpfService lmhswryqpfService;

    public LmhswryqpfController(LmhswryqpfService lmhswryqpfService) {
        this.lmhswryqpfService = lmhswryqpfService;
    }

    @Get("/")
    public String index() {
        return lmhswryqpfService.getGreeting();
    }
}
