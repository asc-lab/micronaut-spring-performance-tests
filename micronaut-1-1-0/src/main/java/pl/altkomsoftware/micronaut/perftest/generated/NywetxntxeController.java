package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nywetxntxe")
public class NywetxntxeController {

    private final NywetxntxeService nywetxntxeService;

    public NywetxntxeController(NywetxntxeService nywetxntxeService) {
        this.nywetxntxeService = nywetxntxeService;
    }

    @Get("/")
    public String index() {
        return nywetxntxeService.getGreeting();
    }
}
