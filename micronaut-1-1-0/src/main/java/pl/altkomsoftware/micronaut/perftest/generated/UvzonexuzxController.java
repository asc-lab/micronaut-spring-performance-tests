package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uvzonexuzx")
public class UvzonexuzxController {

    private final UvzonexuzxService uvzonexuzxService;

    public UvzonexuzxController(UvzonexuzxService uvzonexuzxService) {
        this.uvzonexuzxService = uvzonexuzxService;
    }

    @Get("/")
    public String index() {
        return uvzonexuzxService.getGreeting();
    }
}
