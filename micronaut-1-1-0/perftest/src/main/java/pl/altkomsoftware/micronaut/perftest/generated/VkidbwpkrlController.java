package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vkidbwpkrl")
public class VkidbwpkrlController {

    private final VkidbwpkrlService vkidbwpkrlService;

    public VkidbwpkrlController(VkidbwpkrlService vkidbwpkrlService) {
        this.vkidbwpkrlService = vkidbwpkrlService;
    }

    @Get("/")
    public String index() {
        return vkidbwpkrlService.getGreeting();
    }
}
