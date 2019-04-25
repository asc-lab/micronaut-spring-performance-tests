package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kmsemtqayy")
public class KmsemtqayyController {

    private final KmsemtqayyService kmsemtqayyService;

    public KmsemtqayyController(KmsemtqayyService kmsemtqayyService) {
        this.kmsemtqayyService = kmsemtqayyService;
    }

    @Get("/")
    public String index() {
        return kmsemtqayyService.getGreeting();
    }
}
