package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vrmzfadhvv")
public class VrmzfadhvvController {

    private final VrmzfadhvvService vrmzfadhvvService;

    public VrmzfadhvvController(VrmzfadhvvService vrmzfadhvvService) {
        this.vrmzfadhvvService = vrmzfadhvvService;
    }

    @Get("/")
    public String index() {
        return vrmzfadhvvService.getGreeting();
    }
}
