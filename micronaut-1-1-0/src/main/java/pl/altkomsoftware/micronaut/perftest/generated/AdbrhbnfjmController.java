package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/adbrhbnfjm")
public class AdbrhbnfjmController {

    private final AdbrhbnfjmService adbrhbnfjmService;

    public AdbrhbnfjmController(AdbrhbnfjmService adbrhbnfjmService) {
        this.adbrhbnfjmService = adbrhbnfjmService;
    }

    @Get("/")
    public String index() {
        return adbrhbnfjmService.getGreeting();
    }
}
