package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rddvnfiece")
public class RddvnfieceController {

    private final RddvnfieceService rddvnfieceService;

    public RddvnfieceController(RddvnfieceService rddvnfieceService) {
        this.rddvnfieceService = rddvnfieceService;
    }

    @Get("/")
    public String index() {
        return rddvnfieceService.getGreeting();
    }
}
