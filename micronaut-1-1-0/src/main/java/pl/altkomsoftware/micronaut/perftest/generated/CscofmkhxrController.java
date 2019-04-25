package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cscofmkhxr")
public class CscofmkhxrController {

    private final CscofmkhxrService cscofmkhxrService;

    public CscofmkhxrController(CscofmkhxrService cscofmkhxrService) {
        this.cscofmkhxrService = cscofmkhxrService;
    }

    @Get("/")
    public String index() {
        return cscofmkhxrService.getGreeting();
    }
}
