package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vdfztokesl")
public class VdfztokeslController {

    private final VdfztokeslService vdfztokeslService;

    public VdfztokeslController(VdfztokeslService vdfztokeslService) {
        this.vdfztokeslService = vdfztokeslService;
    }

    @Get("/")
    public String index() {
        return vdfztokeslService.getGreeting();
    }
}
