package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GhkwvgjginController {

    private final GhkwvgjginService ghkwvgjginService;

    public GhkwvgjginController(GhkwvgjginService ghkwvgjginService) {
        this.ghkwvgjginService = ghkwvgjginService;
    }

    @RequestMapping("/ghkwvgjgin")
    public String index() {
        return ghkwvgjginService.getGreeting();
    }

}
