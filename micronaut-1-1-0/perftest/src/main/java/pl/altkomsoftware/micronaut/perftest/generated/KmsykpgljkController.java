package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kmsykpgljk")
public class KmsykpgljkController {

    private final KmsykpgljkService kmsykpgljkService;

    public KmsykpgljkController(KmsykpgljkService kmsykpgljkService) {
        this.kmsykpgljkService = kmsykpgljkService;
    }

    @Get("/")
    public String index() {
        return kmsykpgljkService.getGreeting();
    }
}
