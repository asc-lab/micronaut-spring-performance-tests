package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mfiysptmgm")
public class MfiysptmgmController {

    private final MfiysptmgmService mfiysptmgmService;

    public MfiysptmgmController(MfiysptmgmService mfiysptmgmService) {
        this.mfiysptmgmService = mfiysptmgmService;
    }

    @Get("/")
    public String index() {
        return mfiysptmgmService.getGreeting();
    }
}
