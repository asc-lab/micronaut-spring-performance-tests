package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ipyljrzgoj")
public class IpyljrzgojController {

    private final IpyljrzgojService ipyljrzgojService;

    public IpyljrzgojController(IpyljrzgojService ipyljrzgojService) {
        this.ipyljrzgojService = ipyljrzgojService;
    }

    @Get("/")
    public String index() {
        return ipyljrzgojService.getGreeting();
    }
}
