package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ktzrpgoynt")
public class KtzrpgoyntController {

    private final KtzrpgoyntService ktzrpgoyntService;

    public KtzrpgoyntController(KtzrpgoyntService ktzrpgoyntService) {
        this.ktzrpgoyntService = ktzrpgoyntService;
    }

    @Get("/")
    public String index() {
        return ktzrpgoyntService.getGreeting();
    }
}
