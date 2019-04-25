package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fenonuocbf")
public class FenonuocbfController {

    private final FenonuocbfService fenonuocbfService;

    public FenonuocbfController(FenonuocbfService fenonuocbfService) {
        this.fenonuocbfService = fenonuocbfService;
    }

    @Get("/")
    public String index() {
        return fenonuocbfService.getGreeting();
    }
}
