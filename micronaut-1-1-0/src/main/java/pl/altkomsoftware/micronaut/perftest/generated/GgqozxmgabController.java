package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ggqozxmgab")
public class GgqozxmgabController {

    private final GgqozxmgabService ggqozxmgabService;

    public GgqozxmgabController(GgqozxmgabService ggqozxmgabService) {
        this.ggqozxmgabService = ggqozxmgabService;
    }

    @Get("/")
    public String index() {
        return ggqozxmgabService.getGreeting();
    }
}
