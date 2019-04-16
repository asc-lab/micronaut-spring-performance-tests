package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gyecwvegbq")
public class GyecwvegbqController {

    private final GyecwvegbqService gyecwvegbqService;

    public GyecwvegbqController(GyecwvegbqService gyecwvegbqService) {
        this.gyecwvegbqService = gyecwvegbqService;
    }

    @Get("/")
    public String index() {
        return gyecwvegbqService.getGreeting();
    }
}
