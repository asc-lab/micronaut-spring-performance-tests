package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ijysdpfdol")
public class IjysdpfdolController {

    private final IjysdpfdolService ijysdpfdolService;

    public IjysdpfdolController(IjysdpfdolService ijysdpfdolService) {
        this.ijysdpfdolService = ijysdpfdolService;
    }

    @Get("/")
    public String index() {
        return ijysdpfdolService.getGreeting();
    }
}
