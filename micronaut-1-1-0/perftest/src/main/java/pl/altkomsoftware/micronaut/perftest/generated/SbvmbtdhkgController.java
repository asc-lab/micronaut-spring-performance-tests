package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sbvmbtdhkg")
public class SbvmbtdhkgController {

    private final SbvmbtdhkgService sbvmbtdhkgService;

    public SbvmbtdhkgController(SbvmbtdhkgService sbvmbtdhkgService) {
        this.sbvmbtdhkgService = sbvmbtdhkgService;
    }

    @Get("/")
    public String index() {
        return sbvmbtdhkgService.getGreeting();
    }
}
