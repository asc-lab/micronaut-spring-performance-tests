package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ylqbsaovtc")
public class YlqbsaovtcController {

    private final YlqbsaovtcService ylqbsaovtcService;

    public YlqbsaovtcController(YlqbsaovtcService ylqbsaovtcService) {
        this.ylqbsaovtcService = ylqbsaovtcService;
    }

    @Get("/")
    public String index() {
        return ylqbsaovtcService.getGreeting();
    }
}
