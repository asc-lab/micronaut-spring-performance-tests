package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/guqxbxmvxz")
public class GuqxbxmvxzController {

    private final GuqxbxmvxzService guqxbxmvxzService;

    public GuqxbxmvxzController(GuqxbxmvxzService guqxbxmvxzService) {
        this.guqxbxmvxzService = guqxbxmvxzService;
    }

    @Get("/")
    public String index() {
        return guqxbxmvxzService.getGreeting();
    }
}
