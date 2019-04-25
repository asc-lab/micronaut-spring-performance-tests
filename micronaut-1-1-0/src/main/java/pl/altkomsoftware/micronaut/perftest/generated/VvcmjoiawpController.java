package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vvcmjoiawp")
public class VvcmjoiawpController {

    private final VvcmjoiawpService vvcmjoiawpService;

    public VvcmjoiawpController(VvcmjoiawpService vvcmjoiawpService) {
        this.vvcmjoiawpService = vvcmjoiawpService;
    }

    @Get("/")
    public String index() {
        return vvcmjoiawpService.getGreeting();
    }
}
