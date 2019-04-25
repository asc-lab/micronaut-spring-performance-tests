package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vufzqvsgkn")
public class VufzqvsgknController {

    private final VufzqvsgknService vufzqvsgknService;

    public VufzqvsgknController(VufzqvsgknService vufzqvsgknService) {
        this.vufzqvsgknService = vufzqvsgknService;
    }

    @Get("/")
    public String index() {
        return vufzqvsgknService.getGreeting();
    }
}
