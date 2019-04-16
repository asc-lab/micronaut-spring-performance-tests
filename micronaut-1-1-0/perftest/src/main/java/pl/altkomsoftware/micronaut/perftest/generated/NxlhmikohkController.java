package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nxlhmikohk")
public class NxlhmikohkController {

    private final NxlhmikohkService nxlhmikohkService;

    public NxlhmikohkController(NxlhmikohkService nxlhmikohkService) {
        this.nxlhmikohkService = nxlhmikohkService;
    }

    @Get("/")
    public String index() {
        return nxlhmikohkService.getGreeting();
    }
}
