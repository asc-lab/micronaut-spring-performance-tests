package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ubqlsxnbuk")
public class UbqlsxnbukController {

    private final UbqlsxnbukService ubqlsxnbukService;

    public UbqlsxnbukController(UbqlsxnbukService ubqlsxnbukService) {
        this.ubqlsxnbukService = ubqlsxnbukService;
    }

    @Get("/")
    public String index() {
        return ubqlsxnbukService.getGreeting();
    }
}
