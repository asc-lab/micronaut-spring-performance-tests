package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yogoiufwtz")
public class YogoiufwtzController {

    private final YogoiufwtzService yogoiufwtzService;

    public YogoiufwtzController(YogoiufwtzService yogoiufwtzService) {
        this.yogoiufwtzService = yogoiufwtzService;
    }

    @Get("/")
    public String index() {
        return yogoiufwtzService.getGreeting();
    }
}
