package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/djlkntthwd")
public class DjlkntthwdController {

    private final DjlkntthwdService djlkntthwdService;

    public DjlkntthwdController(DjlkntthwdService djlkntthwdService) {
        this.djlkntthwdService = djlkntthwdService;
    }

    @Get("/")
    public String index() {
        return djlkntthwdService.getGreeting();
    }
}
