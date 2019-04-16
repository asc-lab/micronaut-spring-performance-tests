package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vqrsblkymj")
public class VqrsblkymjController {

    private final VqrsblkymjService vqrsblkymjService;

    public VqrsblkymjController(VqrsblkymjService vqrsblkymjService) {
        this.vqrsblkymjService = vqrsblkymjService;
    }

    @Get("/")
    public String index() {
        return vqrsblkymjService.getGreeting();
    }
}
