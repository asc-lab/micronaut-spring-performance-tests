package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yhfckoukma")
public class YhfckoukmaController {

    private final YhfckoukmaService yhfckoukmaService;

    public YhfckoukmaController(YhfckoukmaService yhfckoukmaService) {
        this.yhfckoukmaService = yhfckoukmaService;
    }

    @Get("/")
    public String index() {
        return yhfckoukmaService.getGreeting();
    }
}
