package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ncphljvmlf")
public class NcphljvmlfController {

    private final NcphljvmlfService ncphljvmlfService;

    public NcphljvmlfController(NcphljvmlfService ncphljvmlfService) {
        this.ncphljvmlfService = ncphljvmlfService;
    }

    @Get("/")
    public String index() {
        return ncphljvmlfService.getGreeting();
    }
}
