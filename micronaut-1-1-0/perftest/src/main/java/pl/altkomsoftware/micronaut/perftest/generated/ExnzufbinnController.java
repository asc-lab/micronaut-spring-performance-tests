package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/exnzufbinn")
public class ExnzufbinnController {

    private final ExnzufbinnService exnzufbinnService;

    public ExnzufbinnController(ExnzufbinnService exnzufbinnService) {
        this.exnzufbinnService = exnzufbinnService;
    }

    @Get("/")
    public String index() {
        return exnzufbinnService.getGreeting();
    }
}
