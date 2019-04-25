package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kxfcrpszzi")
public class KxfcrpszziController {

    private final KxfcrpszziService kxfcrpszziService;

    public KxfcrpszziController(KxfcrpszziService kxfcrpszziService) {
        this.kxfcrpszziService = kxfcrpszziService;
    }

    @Get("/")
    public String index() {
        return kxfcrpszziService.getGreeting();
    }
}
