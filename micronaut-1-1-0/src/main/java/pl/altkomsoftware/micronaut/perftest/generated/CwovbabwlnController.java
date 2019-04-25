package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cwovbabwln")
public class CwovbabwlnController {

    private final CwovbabwlnService cwovbabwlnService;

    public CwovbabwlnController(CwovbabwlnService cwovbabwlnService) {
        this.cwovbabwlnService = cwovbabwlnService;
    }

    @Get("/")
    public String index() {
        return cwovbabwlnService.getGreeting();
    }
}
