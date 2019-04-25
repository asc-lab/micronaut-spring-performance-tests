package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/utogoiudxk")
public class UtogoiudxkController {

    private final UtogoiudxkService utogoiudxkService;

    public UtogoiudxkController(UtogoiudxkService utogoiudxkService) {
        this.utogoiudxkService = utogoiudxkService;
    }

    @Get("/")
    public String index() {
        return utogoiudxkService.getGreeting();
    }
}
