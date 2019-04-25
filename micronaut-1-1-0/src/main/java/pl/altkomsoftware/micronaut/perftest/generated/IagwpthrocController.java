package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iagwpthroc")
public class IagwpthrocController {

    private final IagwpthrocService iagwpthrocService;

    public IagwpthrocController(IagwpthrocService iagwpthrocService) {
        this.iagwpthrocService = iagwpthrocService;
    }

    @Get("/")
    public String index() {
        return iagwpthrocService.getGreeting();
    }
}
