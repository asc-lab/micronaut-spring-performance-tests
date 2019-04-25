package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eklbxubhcr")
public class EklbxubhcrController {

    private final EklbxubhcrService eklbxubhcrService;

    public EklbxubhcrController(EklbxubhcrService eklbxubhcrService) {
        this.eklbxubhcrService = eklbxubhcrService;
    }

    @Get("/")
    public String index() {
        return eklbxubhcrService.getGreeting();
    }
}
