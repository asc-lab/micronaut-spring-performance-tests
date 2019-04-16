package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mkttrimkbm")
public class MkttrimkbmController {

    private final MkttrimkbmService mkttrimkbmService;

    public MkttrimkbmController(MkttrimkbmService mkttrimkbmService) {
        this.mkttrimkbmService = mkttrimkbmService;
    }

    @Get("/")
    public String index() {
        return mkttrimkbmService.getGreeting();
    }
}
