package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mkfcpkdeci")
public class MkfcpkdeciController {

    private final MkfcpkdeciService mkfcpkdeciService;

    public MkfcpkdeciController(MkfcpkdeciService mkfcpkdeciService) {
        this.mkfcpkdeciService = mkfcpkdeciService;
    }

    @Get("/")
    public String index() {
        return mkfcpkdeciService.getGreeting();
    }
}
