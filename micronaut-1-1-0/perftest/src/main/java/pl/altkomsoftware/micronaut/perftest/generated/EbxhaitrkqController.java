package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ebxhaitrkq")
public class EbxhaitrkqController {

    private final EbxhaitrkqService ebxhaitrkqService;

    public EbxhaitrkqController(EbxhaitrkqService ebxhaitrkqService) {
        this.ebxhaitrkqService = ebxhaitrkqService;
    }

    @Get("/")
    public String index() {
        return ebxhaitrkqService.getGreeting();
    }
}
