package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jjlzhuzkpu")
public class JjlzhuzkpuController {

    private final JjlzhuzkpuService jjlzhuzkpuService;

    public JjlzhuzkpuController(JjlzhuzkpuService jjlzhuzkpuService) {
        this.jjlzhuzkpuService = jjlzhuzkpuService;
    }

    @Get("/")
    public String index() {
        return jjlzhuzkpuService.getGreeting();
    }
}
