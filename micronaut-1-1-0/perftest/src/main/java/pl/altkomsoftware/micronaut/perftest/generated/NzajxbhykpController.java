package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nzajxbhykp")
public class NzajxbhykpController {

    private final NzajxbhykpService nzajxbhykpService;

    public NzajxbhykpController(NzajxbhykpService nzajxbhykpService) {
        this.nzajxbhykpService = nzajxbhykpService;
    }

    @Get("/")
    public String index() {
        return nzajxbhykpService.getGreeting();
    }
}
