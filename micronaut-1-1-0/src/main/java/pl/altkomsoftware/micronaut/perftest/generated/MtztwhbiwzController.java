package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mtztwhbiwz")
public class MtztwhbiwzController {

    private final MtztwhbiwzService mtztwhbiwzService;

    public MtztwhbiwzController(MtztwhbiwzService mtztwhbiwzService) {
        this.mtztwhbiwzService = mtztwhbiwzService;
    }

    @Get("/")
    public String index() {
        return mtztwhbiwzService.getGreeting();
    }
}
