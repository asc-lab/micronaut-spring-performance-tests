package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xjdilamaru")
public class XjdilamaruController {

    private final XjdilamaruService xjdilamaruService;

    public XjdilamaruController(XjdilamaruService xjdilamaruService) {
        this.xjdilamaruService = xjdilamaruService;
    }

    @Get("/")
    public String index() {
        return xjdilamaruService.getGreeting();
    }
}
