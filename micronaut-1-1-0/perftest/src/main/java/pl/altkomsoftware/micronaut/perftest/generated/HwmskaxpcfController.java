package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hwmskaxpcf")
public class HwmskaxpcfController {

    private final HwmskaxpcfService hwmskaxpcfService;

    public HwmskaxpcfController(HwmskaxpcfService hwmskaxpcfService) {
        this.hwmskaxpcfService = hwmskaxpcfService;
    }

    @Get("/")
    public String index() {
        return hwmskaxpcfService.getGreeting();
    }
}
