package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aubdkgkhef")
public class AubdkgkhefController {

    private final AubdkgkhefService aubdkgkhefService;

    public AubdkgkhefController(AubdkgkhefService aubdkgkhefService) {
        this.aubdkgkhefService = aubdkgkhefService;
    }

    @Get("/")
    public String index() {
        return aubdkgkhefService.getGreeting();
    }
}
