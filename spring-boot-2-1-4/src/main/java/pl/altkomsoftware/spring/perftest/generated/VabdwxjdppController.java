package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VabdwxjdppController {

    private final VabdwxjdppService vabdwxjdppService;

    public VabdwxjdppController(VabdwxjdppService vabdwxjdppService) {
        this.vabdwxjdppService = vabdwxjdppService;
    }

    @RequestMapping("/vabdwxjdpp")
    public String index() {
        return vabdwxjdppService.getGreeting();
    }

}
