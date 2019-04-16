package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nxkykvopcu")
public class NxkykvopcuController {

    private final NxkykvopcuService nxkykvopcuService;

    public NxkykvopcuController(NxkykvopcuService nxkykvopcuService) {
        this.nxkykvopcuService = nxkykvopcuService;
    }

    @Get("/")
    public String index() {
        return nxkykvopcuService.getGreeting();
    }
}
