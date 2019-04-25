package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/usjxbxcuze")
public class UsjxbxcuzeController {

    private final UsjxbxcuzeService usjxbxcuzeService;

    public UsjxbxcuzeController(UsjxbxcuzeService usjxbxcuzeService) {
        this.usjxbxcuzeService = usjxbxcuzeService;
    }

    @Get("/")
    public String index() {
        return usjxbxcuzeService.getGreeting();
    }
}
