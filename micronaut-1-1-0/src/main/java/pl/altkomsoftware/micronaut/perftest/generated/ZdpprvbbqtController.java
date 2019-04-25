package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zdpprvbbqt")
public class ZdpprvbbqtController {

    private final ZdpprvbbqtService zdpprvbbqtService;

    public ZdpprvbbqtController(ZdpprvbbqtService zdpprvbbqtService) {
        this.zdpprvbbqtService = zdpprvbbqtService;
    }

    @Get("/")
    public String index() {
        return zdpprvbbqtService.getGreeting();
    }
}
