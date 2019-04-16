package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hcijhhxgrt")
public class HcijhhxgrtController {

    private final HcijhhxgrtService hcijhhxgrtService;

    public HcijhhxgrtController(HcijhhxgrtService hcijhhxgrtService) {
        this.hcijhhxgrtService = hcijhhxgrtService;
    }

    @Get("/")
    public String index() {
        return hcijhhxgrtService.getGreeting();
    }
}
