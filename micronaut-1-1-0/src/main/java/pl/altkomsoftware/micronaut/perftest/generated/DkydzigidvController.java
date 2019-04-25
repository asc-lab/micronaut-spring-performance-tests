package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dkydzigidv")
public class DkydzigidvController {

    private final DkydzigidvService dkydzigidvService;

    public DkydzigidvController(DkydzigidvService dkydzigidvService) {
        this.dkydzigidvService = dkydzigidvService;
    }

    @Get("/")
    public String index() {
        return dkydzigidvService.getGreeting();
    }
}
