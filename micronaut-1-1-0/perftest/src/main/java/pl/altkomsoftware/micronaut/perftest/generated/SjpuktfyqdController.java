package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sjpuktfyqd")
public class SjpuktfyqdController {

    private final SjpuktfyqdService sjpuktfyqdService;

    public SjpuktfyqdController(SjpuktfyqdService sjpuktfyqdService) {
        this.sjpuktfyqdService = sjpuktfyqdService;
    }

    @Get("/")
    public String index() {
        return sjpuktfyqdService.getGreeting();
    }
}
