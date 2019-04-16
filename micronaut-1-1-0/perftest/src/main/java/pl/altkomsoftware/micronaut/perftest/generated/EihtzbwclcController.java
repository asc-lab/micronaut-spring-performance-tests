package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eihtzbwclc")
public class EihtzbwclcController {

    private final EihtzbwclcService eihtzbwclcService;

    public EihtzbwclcController(EihtzbwclcService eihtzbwclcService) {
        this.eihtzbwclcService = eihtzbwclcService;
    }

    @Get("/")
    public String index() {
        return eihtzbwclcService.getGreeting();
    }
}
