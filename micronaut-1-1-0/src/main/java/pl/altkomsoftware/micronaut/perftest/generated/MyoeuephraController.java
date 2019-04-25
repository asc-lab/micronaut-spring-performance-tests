package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/myoeuephra")
public class MyoeuephraController {

    private final MyoeuephraService myoeuephraService;

    public MyoeuephraController(MyoeuephraService myoeuephraService) {
        this.myoeuephraService = myoeuephraService;
    }

    @Get("/")
    public String index() {
        return myoeuephraService.getGreeting();
    }
}
