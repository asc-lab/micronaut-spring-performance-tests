package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ksyyejdqfq")
public class KsyyejdqfqController {

    private final KsyyejdqfqService ksyyejdqfqService;

    public KsyyejdqfqController(KsyyejdqfqService ksyyejdqfqService) {
        this.ksyyejdqfqService = ksyyejdqfqService;
    }

    @Get("/")
    public String index() {
        return ksyyejdqfqService.getGreeting();
    }
}
