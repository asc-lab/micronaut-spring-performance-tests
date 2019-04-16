package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/raeanhyomd")
public class RaeanhyomdController {

    private final RaeanhyomdService raeanhyomdService;

    public RaeanhyomdController(RaeanhyomdService raeanhyomdService) {
        this.raeanhyomdService = raeanhyomdService;
    }

    @Get("/")
    public String index() {
        return raeanhyomdService.getGreeting();
    }
}
