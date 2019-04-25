package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jcexnegpvk")
public class JcexnegpvkController {

    private final JcexnegpvkService jcexnegpvkService;

    public JcexnegpvkController(JcexnegpvkService jcexnegpvkService) {
        this.jcexnegpvkService = jcexnegpvkService;
    }

    @Get("/")
    public String index() {
        return jcexnegpvkService.getGreeting();
    }
}
