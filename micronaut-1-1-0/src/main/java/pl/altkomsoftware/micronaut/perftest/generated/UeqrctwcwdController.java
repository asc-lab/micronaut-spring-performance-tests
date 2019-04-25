package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ueqrctwcwd")
public class UeqrctwcwdController {

    private final UeqrctwcwdService ueqrctwcwdService;

    public UeqrctwcwdController(UeqrctwcwdService ueqrctwcwdService) {
        this.ueqrctwcwdService = ueqrctwcwdService;
    }

    @Get("/")
    public String index() {
        return ueqrctwcwdService.getGreeting();
    }
}
