package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ogbcrptvru")
public class OgbcrptvruController {

    private final OgbcrptvruService ogbcrptvruService;

    public OgbcrptvruController(OgbcrptvruService ogbcrptvruService) {
        this.ogbcrptvruService = ogbcrptvruService;
    }

    @Get("/")
    public String index() {
        return ogbcrptvruService.getGreeting();
    }
}
