package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vkzsqioikh")
public class VkzsqioikhController {

    private final VkzsqioikhService vkzsqioikhService;

    public VkzsqioikhController(VkzsqioikhService vkzsqioikhService) {
        this.vkzsqioikhService = vkzsqioikhService;
    }

    @Get("/")
    public String index() {
        return vkzsqioikhService.getGreeting();
    }
}
