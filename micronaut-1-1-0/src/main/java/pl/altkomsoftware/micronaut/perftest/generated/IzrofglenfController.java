package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/izrofglenf")
public class IzrofglenfController {

    private final IzrofglenfService izrofglenfService;

    public IzrofglenfController(IzrofglenfService izrofglenfService) {
        this.izrofglenfService = izrofglenfService;
    }

    @Get("/")
    public String index() {
        return izrofglenfService.getGreeting();
    }
}
