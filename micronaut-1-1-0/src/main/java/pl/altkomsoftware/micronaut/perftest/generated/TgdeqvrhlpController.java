package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tgdeqvrhlp")
public class TgdeqvrhlpController {

    private final TgdeqvrhlpService tgdeqvrhlpService;

    public TgdeqvrhlpController(TgdeqvrhlpService tgdeqvrhlpService) {
        this.tgdeqvrhlpService = tgdeqvrhlpService;
    }

    @Get("/")
    public String index() {
        return tgdeqvrhlpService.getGreeting();
    }
}
