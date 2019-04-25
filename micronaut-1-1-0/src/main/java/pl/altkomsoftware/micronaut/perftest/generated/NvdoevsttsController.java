package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nvdoevstts")
public class NvdoevsttsController {

    private final NvdoevsttsService nvdoevsttsService;

    public NvdoevsttsController(NvdoevsttsService nvdoevsttsService) {
        this.nvdoevsttsService = nvdoevsttsService;
    }

    @Get("/")
    public String index() {
        return nvdoevsttsService.getGreeting();
    }
}
