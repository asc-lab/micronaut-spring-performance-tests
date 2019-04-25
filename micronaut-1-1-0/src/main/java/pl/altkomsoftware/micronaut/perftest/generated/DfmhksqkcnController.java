package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dfmhksqkcn")
public class DfmhksqkcnController {

    private final DfmhksqkcnService dfmhksqkcnService;

    public DfmhksqkcnController(DfmhksqkcnService dfmhksqkcnService) {
        this.dfmhksqkcnService = dfmhksqkcnService;
    }

    @Get("/")
    public String index() {
        return dfmhksqkcnService.getGreeting();
    }
}
