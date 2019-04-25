package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/imtodtmrke")
public class ImtodtmrkeController {

    private final ImtodtmrkeService imtodtmrkeService;

    public ImtodtmrkeController(ImtodtmrkeService imtodtmrkeService) {
        this.imtodtmrkeService = imtodtmrkeService;
    }

    @Get("/")
    public String index() {
        return imtodtmrkeService.getGreeting();
    }
}
