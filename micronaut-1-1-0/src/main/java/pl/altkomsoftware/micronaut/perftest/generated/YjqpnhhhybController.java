package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yjqpnhhhyb")
public class YjqpnhhhybController {

    private final YjqpnhhhybService yjqpnhhhybService;

    public YjqpnhhhybController(YjqpnhhhybService yjqpnhhhybService) {
        this.yjqpnhhhybService = yjqpnhhhybService;
    }

    @Get("/")
    public String index() {
        return yjqpnhhhybService.getGreeting();
    }
}
